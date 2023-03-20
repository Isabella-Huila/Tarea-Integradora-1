public class TopScore {
    private NodeScore rootScore;

    public void addScoreRegister(Player player){
        NodeScore score= new NodeScore(player);
        addScore(score);
    }

    public void addScore(NodeScore nodeScore){
        if(rootScore == null){
            rootScore= nodeScore;
        }else {
            addScore(rootScore , nodeScore);
        }
    }

    private void addScore(NodeScore current, NodeScore nodeScore){
        if(nodeScore.getScore() > current.getScore()){
            // meter a la izquierda
            if (current.getLeft() == null){
                current.setLeft(nodeScore);
            }else{
                addScore(current.getLeft(), nodeScore);
            }
        }else if (nodeScore.getScore() < current.getScore()){
            // meter a la derecha
            if (current.getRight() == null){
                current.setRight(nodeScore);
            }else {
                addScore(current.getRight() , nodeScore);
            }
        }else {
            //No hacer nada (si son iguales)
            return;
        }
    }

    public NodeScore getRootScore() {
        return rootScore;
    }

    public void top(){
        top(rootScore);
    }

    private void top(NodeScore current){
        if (current== null){
            return;
        }
        top(current.getLeft());
        System.out.println(current.getScore() + " "+ current.getPlayer().getName());
        // Se va al subarbol de la derecha
        top(current.getRight());
    }
}
