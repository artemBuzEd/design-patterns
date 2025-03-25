public class PlayerMomentoCaretaker {
    Object objPlayerMomemnto;

    public void saveState(Player player){
        objPlayerMomemnto = player.save();
    }

    public void loadState(Player player){
        player.restore(objPlayerMomemnto);
    }
}
