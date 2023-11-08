class Autocarro extends Carro {
  String rota;
  String operadora;

  public Autocarro(int p, int pot, int vel, String cor, String rota, String operadora) {
    super(p, cor, vel, pot);
    this.rota = rota;
    this.operadora = operadora;
  }
}
class Carro {
  int peso;
  String cor;
  int potencia;
  int velocidade;

  void acelerar(int v) {
    velocidade += v;
  }

  private void travar(int v) {
    velocidade += v;
  }

  public Carro(int peso, String cor, int potencia, int velocidade) {
    this.peso = peso;
    this.potencia = potencia;
    this.velocidade = potencia;
    this.cor = cor;
  }
}

public class car_example {
  public static void main(String[] args) {
    Carro xpto = new Carro(2500, "Azul", 170, 0);
    Autocarro autocarro = new Autocarro(112500, 170, 0, "Azul", "PORTO", "STCP");
    autocarro.acelerar(20);
    xpto.acelerar(100);

    System.out.println(autocarro.peso);
  }
}
