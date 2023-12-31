package com.albertblanc;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class AlberblancTest extends AlberBlancTestBase {
    @Tag("remote")
    @Test
    void smokeMainPageTest() {

        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Open main page", () -> open(baseUrl));
        step("Click on Careers", () -> {
            $(byText("Careers"))
                    .shouldBe(Condition.visible)
                    .click();
        });
        step("Check if CareerS text is present", () -> {
            $(byCssSelector(".font-title.text-header-2.text-headlines.uppercase.mb-4.sm_text-header-1-sm"))
                    .shouldHave(Condition.text("CareerS"));
        });

        step("Click on All Locations", () -> {
            $(byText("All Locations"))
                    .shouldBe(Condition.visible)
                    .click();
        });

        step("Check if Cyprus text is present and select it", () -> {
            $(byText("Cyprus"))
                    .shouldHave(Condition.text("Cyprus"))
                    .click();
        });

        step("Click on All Categories", () -> {
            $(byText("All Categories"))
                    .shouldBe(Condition.visible)
                    .click();
        });

        step("Click on Quality Assurance", () -> {
            $(byText("Quality Assurance"))
                    .shouldBe(Condition.visible)
                    .click();
        });


        step("Click on Team", () -> {
            $(byText("Team"))
                    .shouldBe(Condition.visible)
                    .click();
        });

        step("Check if 'THE TEAM' text is present", () -> {
            $(byCssSelector(".font-title.text-headlines.text-header-2.sm_text-header-1-sm.mb-10"))
                    .shouldHave(Condition.text("THE TEAM"));
        });


        step("Click on Events", () -> {
            $(byText("Events"))
                    .shouldBe(Condition.visible)
                    .click();
        });

        step("Check if 'Events' text is present", () -> {
            $(byCssSelector(".font-title.text-headlines.text-header-2.sm_text-header-1-sm.uppercase.mb-8"))
                    .shouldHave(Condition.text("Events"));
        });

        step("Click on Office", () -> {
            $(byText("Office"))
                    .shouldBe(Condition.visible)
                    .click();
        });

        step("Check if 'Offices' text is present", () -> {
            $(byCssSelector(".font-title.text-headlines.text-header-2.uppercase.mr-20.sm_text-header-1-sm.sm_mb-4.sm_mr-0"))
                    .shouldHave(Condition.text("Offices"));
        });
        sleep(5000);
    }
}
