package Hero;

public class Warrior {
    String name;
    int hit;
    int hp;
    int mp;
    int amor;
    String class_T;
    
    
    public Warrior(String name, int hit, int hp, int mp, int amor, String class_T){
        this.name = name;
        this.hit = hit;
        this.hp = hp;
        this.mp = mp;
        this.amor = amor;
        this.class_T = class_T;
        
    }
    public void showInfo(){
        System.out.println("이름 : " + this.name);
        System.out.println("체력 : " + this.hp);
        System.out.println("마나 : " + this.mp);
        System.out.println("방어력 : " + this.amor);
        System.out.println("직업 : " + this.class_T);
        
    }
    public int attack() {
        double random = Math.random();
        //(이게 랜덤 공격 * 숫자 = 데미지는 늘려주지 최대, 최소값 바뀜) + 0 (최소값)
        int intValue = (int) (random * 101) + 50;
        if (intValue > 60) {
            System.out.println(intValue + "공격에 성공했습니다.");
        } else {
            System.out.println("공격에 실패했습니다.");
            intValue = 0;
        }
        return intValue;
    }

    public static void main(String[] args){

    }
    
    
    
}
