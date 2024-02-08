package com.receitas;

import java.util.ArrayList;

import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.receitas.Enum.AvaliacaoEnum;
import com.receitas.Enum.CategoriaEnum;
import com.receitas.Enum.DificuldadeEnum;
import com.receitas.Model.EtapaPreparo;
import com.receitas.Model.Ingrediente;
import com.receitas.Model.Receita;
import com.receitas.Repositories.ReceitaRepository;

@SpringBootApplication
public class ReceitasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReceitasApplication.class, args);
	}

	@Bean
	CommandLineRunner criarReceitasFake(ReceitaRepository rp) {
		return args -> {
			rp.deleteAll();
			// Receita de bife a parmegiana
			Ingrediente bife = new Ingrediente();
			bife.setNome("Bife");
			bife.setUnidadeMedida("kg");
			bife.setQuantidade(1.0);

			
			Ingrediente molho = new Ingrediente();
			molho.setNome("Molho de tomate");
			molho.setUnidadeMedida("Unidade");
			molho.setQuantidade(2);

			Ingrediente trigo = new Ingrediente();
			trigo.setNome("Farinha de trigo");
			trigo.setUnidadeMedida("Xícara");
			trigo.setQuantidade(1);

			Ingrediente ovo = new Ingrediente();
			ovo.setNome("Ovo de galinha");
			ovo.setUnidadeMedida("Unidade");
			ovo.setQuantidade(2);
		

			Ingrediente farinha = new Ingrediente();
			farinha.setNome("Farinha panco");
			farinha.setUnidadeMedida("Xícara");
			farinha.setQuantidade(1);

			Ingrediente queijo = new Ingrediente();
			queijo.setNome("Queijo mussarela");
			queijo.setUnidadeMedida("Gramas");
			queijo.setQuantidade(200);

			Ingrediente oleo = new Ingrediente();
			oleo.setNome("Óleo de soja");
			oleo.setUnidadeMedida("Xícara");
			oleo.setQuantidade(1);

			Ingrediente sal = new Ingrediente();
			sal.setNome("Sal fino");
			sal.setUnidadeMedida("Colher");

			Ingrediente pimenta = new Ingrediente();
			pimenta.setNome("Pimenta do reino");
			pimenta.setUnidadeMedida("Colher");
			pimenta.setQuantidade(1);

			EtapaPreparo temperar = new EtapaPreparo();
			temperar.setDescricao("Temperar o bife com sal e pimenta");

			EtapaPreparo empanar = new EtapaPreparo();
			empanar.setDescricao("Passar o bife na farinha de trigo, no ovo e finalmente na farinha panco");

			EtapaPreparo fritar = new EtapaPreparo();
			fritar.setDescricao("Aquecer o óleo em uma frigideira e fritar até ficar douradinho");

			EtapaPreparo gratinar = new EtapaPreparo();
			gratinar.setDescricao("Colocar em uma forma, adicionar o molho, queijo mussarela e aquecer até o ponto da sua preferência");

			Receita bifeParmegiana = new Receita();
			bifeParmegiana.setNome("Bife à parmegiana");
			bifeParmegiana.setCategoria(CategoriaEnum.SALGADOS);
			bifeParmegiana.setDificuldade(DificuldadeEnum.FACIL);
			bifeParmegiana.setRendimentoDaReceita("Um bife por pessoa");
			bifeParmegiana.setAutor("Victor Sabatin");
			bifeParmegiana.setDescricao("Bife à parmegiana muito saboroso para deixar sua refeição deliciosa");
			bifeParmegiana.setTempoDePreparo(10);
			bifeParmegiana.setObservacao("O sal e pimenta deve ser à gosto");
			bifeParmegiana.setAvaliacao(AvaliacaoEnum.CINCO_ESTRELAS);

			List<EtapaPreparo> etapas = new ArrayList<>();
			etapas.add(temperar);
			etapas.add(empanar);
			etapas.add(fritar);
			etapas.add(gratinar);
			bifeParmegiana.setEtapas(etapas);

			List<Ingrediente> ingredientes = new ArrayList<>();
			ingredientes.add(pimenta);
			ingredientes.add(sal);
			ingredientes.add(trigo);
			ingredientes.add(bife);
			ingredientes.add(molho);
			ingredientes.add(farinha);
			ingredientes.add(ovo);
			ingredientes.add(queijo);
			ingredientes.add(oleo);
			bifeParmegiana.setIngredientes(ingredientes);
			rp.save(bifeParmegiana);
		};
	}

}
