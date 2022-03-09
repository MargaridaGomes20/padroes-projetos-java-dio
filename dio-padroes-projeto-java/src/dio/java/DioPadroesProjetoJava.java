package dio.java;

import dio.java.facade.Facade;
import dio.java.strategy.Robo;
import dio.java.strategy.ComportamentoAgressivo;
import dio.java.strategy.ComportamentoDefensivo;
import dio.java.strategy.Comportamento;
import dio.java.strategy.ComportamentoNormal;
import dio.java.singleton.SingletonEager;
import dio.java.singleton.SingletonLazy;
import dio.java.singleton.SingletonLazyHolder;



public class DioPadroesProjetoJava {

    public static void main(String[] args) {
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);

		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();

		Facade facade = new Facade();
		facade.migrarCliente("Vanessa", "148889788");
	}
}
    
