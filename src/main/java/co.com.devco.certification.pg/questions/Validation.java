package co.com.devco.certification.pg.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Validation implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        String m = actor.recall("NameInput");
        String n = actor.recall("NameNote");
        if (m.contains(n)){
            return true;
        }else{
            return false;
        }

    }

    public static Validation ok(){
        return new Validation();
    }
}
