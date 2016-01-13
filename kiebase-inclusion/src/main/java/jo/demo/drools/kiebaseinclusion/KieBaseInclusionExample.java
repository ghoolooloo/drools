package jo.demo.drools.kiebaseinclusion;

import java.io.PrintStream;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import jo.demo.drools.namedkiesession.Message;

public class KieBaseInclusionExample {

    public void go(PrintStream out) {
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession kSession = kContainer.newKieSession("ksession2");
        kSession.setGlobal("out", out);

        kSession.insert(new Message("Dave", "Hello, HAL. Do you read me, HAL?"));
        kSession.fireAllRules();

        kSession.insert(new Message("Dave", "Open the pod bay doors, HAL."));
        kSession.fireAllRules();
    }

    public static void main(String[] args) {
        new KieBaseInclusionExample().go(System.out);
    }

}
