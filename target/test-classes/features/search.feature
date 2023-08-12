@search
Feature: Search
  @success-search-and-play-video
  Scenario: Search - Success search and play video
    Given user access to "youtube-homepage"
    When user input search with "Fokus Populix Jembatani Riset untuk Semua"
    And  user click search button
    And user click on "Fokus Populix Jembatani Riset untuk Semua" video
    Then user should be at the "Fokus Populix Jembatani Riset untuk Semua" video page