import java.io.*;
import java.util.*;

public class model {
    player[] p = new player[4];
    land[] l = new land[40];
    slot[] s = new slot[23];
    int turn = 0;
    int[] slotIndex = {0,1,2,3,5,6,8,12,13,15,16,18,22,24,25,27,28,32,33,34,36,37,38};
    HashMap<Integer, Integer> dict = new HashMap<Integer, Integer>();
    boolean gameover = false;    
    controller c;
    public void setController(controller c) {
        this.c = c;
    }
    
    public void initialize(){
        turn = 0;
        
        for(int i = 0; i < 40; i++) {
            l[i] = new land();
            l[i].isSlot = false;
            l[i].ownerID = 4;
        }
        
        for(int i = 0; i < slotIndex.length; i++) {
            s[i] = l[slotIndex[i]];
            l[slotIndex[i]].isSlot = true;
            dict.put(slotIndex[i], i);
        }
        
        for (int i = 0; i < 4; i++) {
            p[i] = new player();
            p[i].money = 1000;
            p[i].alive = true;
            p[i].position = 0;
            l[0].playerHere.add("p" + i);
            c.updateMoney(i, p[i].money);
        }
        
        c.updateMap(0, "p1, p2, p3, p4");
        
        try {
            File file = new File("data.csv");
            Scanner sc = new Scanner(file);
            for (int i = 0; sc.hasNext(); i++) {
                String[] line = sc.nextLine().split(",");
                s[i] = new slot();
                s[i].go = false;
                s[i].name = line[0];
                s[i].price = Integer.parseInt(line[1]);
                c.updateSlot(i, s[i].name, s[i].price); 
            }
            s[0].go=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
public int drawDice() {
    int dice = 1 + (int)(Math.random() * 10);
    
    
    l[p[turn].position].playerHere.remove("p" + (turn + 1));
    try {
        if (l[p[turn].position].playerHere.contains("p0")){
            l[p[turn].position].playerHere.remove("p0");
            l[p[turn].position].playerHere.add("p4");
        }
    } catch (Exception e) {
    
    }
    c.updateMap(p[turn].position, String.join(",", l[p[turn].position].playerHere));
    
    if (p[turn].position + dice > 39) {
        p[turn].position = p[turn].position + dice -  40;
        l[p[turn].position].playerHere.add("p" + (turn + 1));
        p[turn].money += 2000;
        c.updateMoney(turn, p[turn].money);
    } else {
        p[turn].position = p[turn].position + dice;
        l[p[turn].position].playerHere.add("p" + (turn + 1));
    }
    l[p[turn].position].playerHere.sort(Comparator.naturalOrder());
    String playerList = String.join(",", l[p[turn].position].playerHere);
    c.updateMap(p[turn].position, playerList);
    
    c.locV(p[turn].position, turn);
    
 //   System.out.print(l[p[turn].position].ownerID);System.out.println(l[p[turn].position].isSlot);System.out.print("AT "+p[turn].position);   s[dict.get(p[turn].position)]
    if (l[p[turn].position].isSlot && l[p[turn].position].ownerID == 4 && p[turn].money > s[dict.get(p[turn].position)].price) {
        c.buyControl();
        System.out.print("At slot " + dict.get(p[turn].position));
    } else {
        turn ++;
  //  System.out.println("turn end");
    if (turn == 4) {
            turn = 0;
        }
    }
    c.updateNotice(turn + 1);
    if (turn == 4) {
            turn = 0;
        }
    if (l[p[turn].position].isSlot && s[dict.get(p[turn].position)].ownerID < 4 && s[dict.get(p[turn].position)].ownerID != turn){
        System.out.println("owner id "+s[dict.get(p[turn].position)].ownerID);
        p[s[dict.get(p[turn].position)].ownerID].money += l[p[turn].position].price * 0.1;
        c.updateMoney(s[dict.get(p[turn].position)].ownerID, p[s[dict.get(p[turn].position)].ownerID].money);
        p[turn].money -= s[dict.get(p[turn].position)].price * 0.1;
        c.updateMoney(turn, p[turn].money);
    }
    
    
    return dice;
}

public void processBuy(){
    l[p[turn].position].ownerID = turn;
    p[turn].money = p[turn].money - s[dict.get(p[turn].position)].price;
    c.updateMoney(turn, p[turn].money);

    c.updateOwner(dict.get(p[turn].position), turn);
    
    turn ++;
//    System.out.println("turn end");
    if (turn == 4) {
            turn = 0;
        }
    c.updateNotice(turn + 1);
}

public void adminPML(int pl, int m, int lc){
    p[pl].money = m;
    l[p[pl].position].playerHere.remove("p" + (pl + 1));
    try{l[p[pl].position].playerHere.remove("p" + 0);}catch (Exception e){}
    c.updateMap(p[pl].position, String.join(",", l[p[pl].position].playerHere));
    p[pl].position = lc;
    l[lc].playerHere.add("p" + (pl + 1));
    c.updateMoney(pl, m);
    c.updateMap(lc, String.join(",", l[p[pl].position].playerHere));
    c.locV(p[pl].position, pl);
}

public void adminSOP (int sl, int ow, int pr){
    s[sl].ownerID = ow - 1;
    s[sl].price = pr;
    c.updateOwner(sl, (ow - 1));
    c.updatePrice(sl, pr);
    //save();
}

public void adminT (int t){
    turn = t;
    c.updateNotice(t + 1);
}

public void Status(int pl){
    boolean current = p[pl].alive;
    p[pl].alive = !current;
    p[pl].position = 0;
    if (p[pl].alive){
        p[pl].money = 1000;
        try{l[p[pl].position].playerHere.remove("p" + 0);}catch (Exception e){}        
        c.updateMap(0,  String.join(",", l[p[pl].position].playerHere));
    } else {
        p[pl].money = 0;
        l[p[pl].position].playerHere.remove("p" + (pl + 1));
        try{l[p[pl].position].playerHere.remove("p" + 0);}catch (Exception e){}        
        c.updateMap(pl,  String.join(",", l[p[pl].position].playerHere));
    }
    c.updateMoney(p[pl].position, p[pl].money);
    
    for (int i = 0; i < 40; i++) {
        if (l[i].ownerID == pl) {
            l[i].ownerID = 4;
            c.updateOwner(i, 4);
        }
    }
}
/*
public void save() {
    try (PrintWriter writer = new PrintWriter("data.csv")) {
        StringBuilder sb = new StringBuilder();

        
        for (int i = 0; i < 40; i ++) {
            sb.append(l[i].name);
            sb.append(',');
            sb.append(l[i].price);
            sb.append('\n');
        }

      writer.write(sb.toString());

    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    }
}
*/

  //  System.out.print(nah);
  //  System.out.print(p[nah].position);System.out.print(nah);
  //  l[p[nah].position].ownerID = nah;
  //  c.updateOwner(p[nah].position, nah);
   // p[nah].money -= l[p[nah].position].price;
  //  c.updateMoney(nah, p[nah].money);



    
}
