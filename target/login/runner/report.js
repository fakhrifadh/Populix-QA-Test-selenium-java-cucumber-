$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/homepage.feature");
formatter.feature({
  "name": "Homepage",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@search"
    }
  ]
});
formatter.scenario({
  "name": "Homepage - Success go to youtube shorts page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@search"
    },
    {
      "name": "@success-access-youtube-short"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user access to \"youtube-homepage\"",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.HomepageStep.userNavigate(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on youtube shorts menu",
  "keyword": "When "
});
formatter.match({
  "location": "steps.HomepageStep.userClickShorts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be at the \"youtube-shorts\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.HomepageStep.userAtShortsPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/search.feature");
formatter.feature({
  "name": "Search",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@search"
    }
  ]
});
formatter.scenario({
  "name": "Search - Success search and play video",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@search"
    },
    {
      "name": "@success-search-and-play-video"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user access to \"youtube-homepage\"",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.HomepageStep.userNavigate(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input search with \"Fokus Populix Jembatani Riset untuk Semua\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.HomepageStep.userInputKeyword(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click search button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.HomepageStep.useClickSearch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on \"Fokus Populix Jembatani Riset untuk Semua\" video",
  "keyword": "And "
});
formatter.match({
  "location": "steps.HomepageStep.userClickVideo(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be at the \"Fokus Populix Jembatani Riset untuk Semua\" video page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.HomepageStep.userAtVideoPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});