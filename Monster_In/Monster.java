package Monster_In;

public interface Monster {
    public void showInfo(); // 몬스터 현재 상태
    public int hit(); // 몬스터가 용사에게 가하는 데미지
    public void dmg(int dmg); // 몬스터가 입는 데미지
    public void drop(); // 아이템 드랍
    public void create(); //몬스터 종류/

    //public void die(Player player);

}
