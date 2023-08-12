@search
Feature: Homepage
  @success-access-youtube-short
  Scenario: Homepage - Success go to youtube shorts page
    Given user access to "youtube-homepage"
    When user click on youtube shorts menu
    Then user should be at the "youtube-shorts" page