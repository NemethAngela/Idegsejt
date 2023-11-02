public class IdegsejtMukodes {     
    
    IIdegsejtek idegsejtek;

    public IdegsejtMukodes (IIdegsejtek idegsejtek) {

        this.idegsejtek = idegsejtek;
    }

    public void felvetel() {
        idegsejtek.inffelvetel();
    }

    public void tovabbit() {
        idegsejtek.inftovabbit();
    }

    public void feldolgoz() {
        idegsejtek.inffeldolgoz();
    }


    

}
