package StepDefinitions;

import Pages.DialogContent;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class _US19_CouponCode {
    DialogContent cc = new DialogContent();
    Faker dataFaker = new Faker();

    @And("the customer enters the invalid voucher code and clicks apply voucher")
    public void theCustomerEntersTheInvalidVoucherCodeAndClicksApplyVoucher() {
        cc.mySendKeys(cc.couponCodePlc, dataFaker.beer().name());
        cc.myClick(cc.applyCouponBtn);
    }

    @Then("the customer verifies invalid coupon code")
    public void theCustomerVerifiesInvalidCouponCode() {
        cc.waitUntilVisibilityOf(cc.errorCouponCode);
        cc.verifyContainsText(cc.errorCouponCode, "existiert nicht!");
        System.out.println(cc.errorCouponCode.getText());
    }
}
