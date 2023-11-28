# to-do-notebook

The repository, `to-do-notebook`, contains structured to-do lists and other information that are stored for planning (in a `Java`/`JavaScript` way).

## 2023.10.01 - 2023.10.30

```javascript
const today = new Date();
const targetDate = new Date(2023, 10, 30);

const handle2023OctoberMissions = () => {
    if (this.props.isHired === false) {
        // goal: complete the Coursera course.
        let metaFrontendCertificated = false;
        // goal: upgrade the com3105 repo into a complete and business-alike e-commerce website, with `ReactJS` and other technologies.
        let com3105RepoUpgraded = false; 
        // goal: upgrade the com3102 repo into a website that greatly follows the website of the Hang Seng University of Hong Kong.
        let com3102RepoUpgraded = false;

        while (today.toDateString() === targetDate.toDateString()) {
            let result = work();
            result === 'metaFrontendCertificated' ?
                metaFrontendCertificated = true : result === 'com3105RepoUpgraded' ?
                    com3105RepoUpgraded = true : result === 'com3102RepoUpgraded' ? 
                        com3102RepoUpgraded = true : null;
        }
    } else {
        return;
    }
}
```