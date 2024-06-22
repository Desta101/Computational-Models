import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws Exception {
        DFSM dfsm = Has_babb_AsASubstring();
        testDFSM(dfsm, "");
        testDFSM(dfsm, "babb");
        testDFSM(dfsm, "abab");
        testDFSM(dfsm, "baba");
        testDFSM(dfsm, "aababb");
        testDFSM(dfsm, "bbabbba");
    }

    public static void testDFSM(DFSM dfsm, String input) {
        boolean result = dfsm.compute(input);
        System.out.println("Input: " + input + " is " + (result ? "accepted" : "rejected"));
    }

    public static DFSM Has_babb_AsASubstring() throws Exception {
        ArrayList<Character> a = new ArrayList<>();
        a.add('a');
        a.add('b');
        Alphabet alphabet = new Alphabet(a);

        IdentifiedState initState = new IdentifiedState(1);
        IdentifiedState State2 = new IdentifiedState(2);
        IdentifiedState State3 = new IdentifiedState(3);
        IdentifiedState State4 = new IdentifiedState(4);
        IdentifiedState State5 = new IdentifiedState(5);

        Set<State> acceptedStates = new HashSet<>();
        acceptedStates.add(State5);

        Set<State> allStates = new HashSet<>();
        allStates.add(initState);
        allStates.add(State2);
        allStates.add(State3);
        allStates.add(State4);
        allStates.add(State5);

        Set<Transition> transitions = new TreeSet<>();
        transitions.add(new Transition(initState, 'a', initState)); // Stay in S1 on 'a'
        transitions.add(new Transition(initState, 'b', State2)); // Go to S2 on 'b'
        transitions.add(new Transition(State2, 'a', initState)); // Go back to S1 on 'a'
        transitions.add(new Transition(State2, 'b', State3)); // Go to S3 on 'b'
        transitions.add(new Transition(State3, 'a', State3)); // Stay in S3 on 'a'
        transitions.add(new Transition(State3, 'b', State4)); // Go to S4 on 'b'
        transitions.add(new Transition(State4, 'a', initState)); // Go back to S1 on 'a'
        transitions.add(new Transition(State4, 'b', State5)); // Go to S5 on 'b'
        transitions.add(new Transition(State5, 'a', State5)); // Stay in S5 on 'a'
        transitions.add(new Transition(State5, 'b', State5)); // Stay in S5 on 'b'

        TransitionFunction tf = new TransitionFunction(transitions);
        return new DFSM(allStates, alphabet, tf, initState, acceptedStates);
    }
}
