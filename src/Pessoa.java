//javabean
//pojo: plain old java object
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Pessoa{
    private int codigo;
    private String nome;
    private int idade;
    private String hobby;

public static void main(String[] args){
    Pessoa p = new Pessoa();
    p.setNome( "Ana");
    System.out.println(p.getNome());
  }
}