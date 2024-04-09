package elecciones;

public class CandidaturaPartido extends Candidatura {
   public CandidaturaPartido(String p, String cir){
       super(p, cir);
   }
   public void addMember(Candidata c){
       if(c.getPartido().equals(this.getPartido())){
           c.setPartido(null);
       }
       super.addMember(c);
   }

    @Override
    public void addHeadOfList(Candidata cand) {
        if(cand.getPartido().equals(this.getPartido())){
            cand.setPartido(null);
        }
       super.addHeadOfList(cand);
    }
}
