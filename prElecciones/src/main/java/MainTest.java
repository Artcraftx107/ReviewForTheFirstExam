import elecciones.*;

public class MainTest {
    public static void main(String[] args) {
        // Creating candidates
        Candidata candidate1 = new Candidata("Alice", "123", Candidata.Sexo.F, "PartyA");
        Candidata candidate2 = new Candidata("Bob", "456", Candidata.Sexo.M, "PartyB");
        Candidata candidate3 = new Candidata("Charlie", "789", Candidata.Sexo.M, "PartyA");
        Candidata candidate4 = new Candidata("Diana", "321", Candidata.Sexo.F, "PartyA");

        // Creating a candidature
        Candidatura candidature = new Candidatura("PartyA", "Circunscripcion1");

        // Adding members to the candidature
        candidature.addMember(candidate1);
        candidature.addMember(candidate2);
        candidature.addMember(candidate3);
        candidature.addMember(candidate4);

        // Displaying the candidature
        System.out.println("Candidature:");
        System.out.println(candidature);

        // Creating a candidature for a specific party
        CandidaturaPartido candidatureForPartyA = new CandidaturaPartido("PartyA", "Circunscripcion1");

        Candidata candidata5 = new Candidata("Saul", "269", Candidata.Sexo.M);
        // Adding members to the candidature for PartyA
        candidatureForPartyA.addMember(candidate1);
        candidatureForPartyA.addMember(candidate2);
        candidatureForPartyA.addMember(candidate3);
        candidatureForPartyA.addHeadOfList(candidate4);
        candidatureForPartyA.addMember(candidata5);

        // Displaying the candidature for PartyA
        System.out.println("\nCandidature for PartyA:");
        System.out.println(candidatureForPartyA);
        candidatureForPartyA.deleteMember(candidata5);
        System.out.println("\nCandidature for PartyA (without independants):");
        System.out.println(candidatureForPartyA);

    }
}

