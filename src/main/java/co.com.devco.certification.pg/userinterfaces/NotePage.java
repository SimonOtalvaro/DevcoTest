package co.com.devco.certification.pg.userinterfaces;



import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NotePage {

        public static final Target BUTTON_RICH_NOTE = Target.the("Button for rich note").
                located(By.xpath("//button[@id='richtextnote-tab'][1]"));


        public static final Target BUTTON_BOLD = Target.the("Button BOLD text").
                located(By.xpath("(//*[@class='ck ck-icon ck-button__icon'])[7]"));

        public static final Target INPUT_NAME = Target.the("Name of the note").
                located(By.xpath("//*[@class='fs-24 date d-inline-block']"));

        public static final Target INPUT_TEXT = Target.the("Input to enter the text").
                located(By.xpath("//*[@id='editor']"));

        public static final Target BUTTON_SAVE = Target.the("Button to save").
                located(By.xpath("//button[@class='btn save-file-btn saveNotesBtn richtextnoteBtn']"));

        public static final Target INPUT_NAME2 = Target.the("Name of the saved note").
                located(By.xpath("//*[@class='noteItem'][1]"));


}

