$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("purchase.feature");
formatter.feature({
  "line": 2,
  "name": "User purchases from RS Components website",
  "description": "",
  "id": "user-purchases-from-rs-components-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@purchase"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "user should be able to purchase the item",
  "description": "",
  "id": "user-purchases-from-rs-components-website;user-should-be-able-to-purchase-the-item",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on RS Components website landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on brands menu tab",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks on All Brands",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on Letter S and selects siemens brand",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user should be directed to the siemens products page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on the product and clicks buy",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on add to basket",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user clicks on view basket",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "clicks on checkout button for purchase",
  "keyword": "And "
});
formatter.match({
  "location": "SelectedOrderStep.user_is_on_RS_Components_website_landing_page()"
});
formatter.result({
  "duration": 6071732092,
  "status": "passed"
});
formatter.match({
  "location": "SelectedOrderStep.user_clicks_on_brands_menu_tab()"
});
formatter.result({
  "duration": 278591758,
  "status": "passed"
});
formatter.match({
  "location": "SelectedOrderStep.user_clicks_on_All_Brands()"
});
formatter.result({
  "duration": 1236379708,
  "status": "passed"
});
formatter.match({
  "location": "SelectedOrderStep.user_clicks_on_Letter_S_and_selects_siemens_brand()"
});
formatter.result({
  "duration": 4119834408,
  "status": "passed"
});
formatter.match({
  "location": "SelectedOrderStep.user_should_be_directed_to_the_siemens_products_page()"
});
formatter.result({
  "duration": 74587738,
  "status": "passed"
});
formatter.match({
  "location": "SelectedOrderStep.user_clicks_on_the_product_and_clicks_buy()"
});
formatter.result({
  "duration": 4107264735,
  "status": "passed"
});
formatter.match({
  "location": "SelectedOrderStep.user_clicks_on_add_to_basket()"
});
formatter.result({
  "duration": 246540414,
  "status": "passed"
});
formatter.match({
  "location": "SelectedOrderStep.user_clicks_on_view_basket()"
});
formatter.result({
  "duration": 1813092849,
  "status": "passed"
});
formatter.match({
  "location": "SelectedOrderStep.clicks_on_checkout_button_for_purchase()"
});
formatter.result({
  "duration": 249492342,
  "status": "passed"
});
formatter.write("Current Page URL is https://uk.rs-online.com/web/ca/basketsummary/");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 912535993,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "user places a quick order",
  "description": "",
  "id": "user-purchases-from-rs-components-website;user-places-a-quick-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "user is on RS Componets website landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "user enters RS Stock number and selects quantity",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user clicks on Add to Basket",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user is naviagated to the checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user is displayed product availability",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user should be displayed with updated results",
  "keyword": "Then "
});
formatter.match({
  "location": "QuickOrderStep.user_is_on_RS_Componets_website_landing_page()"
});
formatter.result({
  "duration": 5173765442,
  "status": "passed"
});
formatter.match({
  "location": "QuickOrderStep.user_enters_RS_Stock_number_and_selects_quantity()"
});
formatter.result({
  "duration": 262523797,
  "status": "passed"
});
formatter.match({
  "location": "QuickOrderStep.user_clicks_on_Add_to_Basket()"
});
formatter.result({
  "duration": 1553098845,
  "status": "passed"
});
formatter.match({
  "location": "QuickOrderStep.user_is_naviagated_to_the_checkout_page()"
});
formatter.result({
  "duration": 207410557,
  "status": "passed"
});
formatter.match({
  "location": "QuickOrderStep.user_is_displayed_product_availability()"
});
formatter.result({
  "duration": 45193809,
  "status": "passed"
});
formatter.match({
  "location": "QuickOrderStep.user_should_be_displayed_with_updated_results()"
});
formatter.result({
  "duration": 4250850123,
  "status": "passed"
});
formatter.write("Current Page URL is https://uk.rs-online.com/web/");
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 6499454773,
  "status": "passed"
});
formatter.uri("search.feature");
formatter.feature({
  "line": 2,
  "name": "Multiple search based results",
  "description": "",
  "id": "multiple-search-based-results",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@search"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "invalid search",
  "description": "",
  "id": "multiple-search-based-results;invalid-search",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user opens RS Components website landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters invalid text and clicks search",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user is displayed invalid message with search text box",
  "keyword": "Then "
});
formatter.match({
  "location": "InvalidSearchStep.user_opens_RS_Components_website_landing_page()"
});
formatter.result({
  "duration": 4609232310,
  "status": "passed"
});
formatter.match({
  "location": "InvalidSearchStep.user_enters_invalid_text_and_clicks_search()"
});
formatter.result({
  "duration": 1691312766,
  "status": "passed"
});
formatter.match({
  "location": "InvalidSearchStep.user_is_displayed_invalid_message_with_search_text_box()"
});
formatter.result({
  "duration": 2375044460,
  "status": "passed"
});
formatter.write("Current Page URL is https://uk.rs-online.com/web/");
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 7375466973,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "valid search",
  "description": "",
  "id": "multiple-search-based-results;valid-search",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "user opens RSComponents website landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user enter valid text and clicks search",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user is navigated to the products page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user is displayed with products viewing page",
  "keyword": "Then "
});
formatter.match({
  "location": "ValidSearchStep.user_opens_RSComponents_website_landing_page()"
});
formatter.result({
  "duration": 4551149017,
  "status": "passed"
});
formatter.match({
  "location": "ValidSearchStep.user_enter_valid_text_and_clicks_search()"
});
formatter.result({
  "duration": 3729493007,
  "status": "passed"
});
formatter.match({
  "location": "ValidSearchStep.user_is_navigated_to_the_products_page()"
});
formatter.result({
  "duration": 620092673,
  "status": "passed"
});
formatter.match({
  "location": "ValidSearchStep.user_is_displayed_with_products_viewing_page()"
});
formatter.result({
  "duration": 2539352252,
  "status": "passed"
});
formatter.write("Current Page URL is https://uk.rs-online.com/web/");
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "duration": 6496914407,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "search history",
  "description": "",
  "id": "multiple-search-based-results;search-history",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "user opens RS Components website Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "user enters random text and clicks search",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user is displayed with recent searches",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user clicks on recent search item",
  "keyword": "Then "
});
formatter.match({
  "location": "RecentSearchSteps.user_opens_RS_Components_website_Homepage()"
});
formatter.result({
  "duration": 5070186276,
  "status": "passed"
});
formatter.match({
  "location": "RecentSearchSteps.user_enters_random_text_and_clicks_search()"
});
formatter.result({
  "duration": 2324729520,
  "status": "passed"
});
formatter.match({
  "location": "RecentSearchSteps.user_is_displayed_with_recent_searches()"
});
formatter.result({
  "duration": 141910817,
  "status": "passed"
});
formatter.match({
  "location": "RecentSearchSteps.user_clicks_on_recent_search_item()"
});
formatter.result({
  "duration": 311656153,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003ca href\u003d\"https://uk.rs-online.com/web/c/?searchTerm\u003d...\" title\u003d\"Click to repeat search\"\u003eadhesives\u003c/a\u003e is not clickable at point (167, 48). Other element would receive the click: \u003cspan\u003e...\u003c/span\u003e\n  (Session info: chrome\u003d66.0.3359.139)\n  (Driver info: chromedriver\u003d2.35.528161 (5b82f2d2aae0ca24b877009200ced9065a772e73),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.7.1\u0027, revision: \u00278a0099a\u0027, time: \u00272017-11-06T21:01:39.354Z\u0027\nSystem info: host: \u0027DESKTOP-4MEDFTK\u0027, ip: \u0027192.168.0.34\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.35.528161 (5b82f2d2aae0ca..., userDataDir: C:\\Users\\Vinod\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 66.0.3359.139, webStorageEnabled: true}\nSession ID: 655c3657b17a56a2724caff9f533f6f4\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:279)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy15.click(Unknown Source)\r\n\tat lib.WebDriverLib.elementClick(WebDriverLib.java:33)\r\n\tat pages.SearchPage.repeatSearch(SearchPage.java:98)\r\n\tat stepDefinations.RecentSearchSteps.user_clicks_on_recent_search_item(RecentSearchSteps.java:27)\r\n\tat ✽.Then user clicks on recent search item(search.feature:19)\r\n",
  "status": "failed"
});
formatter.write("Current Page URL is https://uk.rs-online.com/web/");
formatter.embedding("image/png", "embedded4.png");
formatter.after({
  "duration": 8567781462,
  "status": "passed"
});
});