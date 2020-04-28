
package day05.A;

//此為繼承範例 兒子繼承父親
public class Father {
    public int a =100;     //沒限制
    protected int b = 200; //限定同一package才可取用 不同package要繼承才可取用
    int c = 300;           //default 沒寫的話  同一package才可取用
    private int d = 400;   //限定同一class才可取用
    
}
