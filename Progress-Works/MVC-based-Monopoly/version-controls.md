# Version History
## Version 1.0
The original version, named version 1.0 is created by my classmate, which has identify the main structure of the whole monopoly game. 
However, some of the function, limited by the time constraint, still requires further modifications. And here is the point where I start handling the project.  
  
Things to do:  
  1. Modify the `editGame` function to ensure the admin role is done
     - Ensure that even the `admin` panel is closed, the game would still continue.
     - Ensure that the `status` button is working fine.
  3. Modify the `doTrade` function to enable in-game trading
  4. Enlarge the `GUI` to fit in all information.

## Version 1.5
The modified version, point 1 and 2 is done at this point, but before risking modifying the `GUI`, I decided to call a save so it does not create any unnecessary yet complicated and time-consuming problems.  
  
Things to do: Enlarge the `GUI` to fit in all information.

## Version 2
Further modified version, there are much more hidden changes done in this one than the previous ones, and as the project is handed-in completely, this might be the last version for a while.  

| Achieved | Improvement |
| --- | --- |
| 1. Fixed the `editGame` bug in registering information. | 1. The GUI problem is hard to fixed as I asked my partner who designed the `GUI`. |
| 2. Fixed the `doTrade` bug in registering information. | 2. The codes can be much more simplified and organised if given enough time. |
| 3. Added various `Exceptions` for handling unwanted inputs. |  |

More problems discovered:  
  1. The `buyLand` function is currently bugged and no lands can be bought after `editGame` function, which means the game is unplayable.
  2. Much more to upgrade into.

Current Display:  
<img src="https://github.com/travrs629/Learnt-from-Universities/blob/main/Progress-Works/MVC-based-Monopoly/src_v2/Display.png" width=550px height=300px>

## Version 2.5
The newest version is currently under-construction which is unplayable, the `model` class is re-programmed to simplier and more user-friendly version. Some of the logic is also re-programmed. However, the `view` class, which is the `GUI` is not yet finished.

## Version 3
Although the `GUI` is not finished, I have come up with two comments about using Java `Swing`:

  1. Always draft out the preferred `GUI` before actual construction, it is a sure pain to re-construct it later.
  2. View the components, especially `JPanel` in `Blocks` view, and leave out `gaps` and `line` border if you need to add more components later.

A disastrous day as I lost my progress on the `GUI` on the day of 2022.05.18, here is a glance of what I have done so far:
<img src="https://github.com/travrs629/Learnt-from-Universities/blob/main/Progress-Works/MVC-based-Monopoly/src_v3/Displayv3.png" width=550px height=300px>

