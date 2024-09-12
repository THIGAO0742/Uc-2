
public class Televisor extends ProdutoEletronico{
	private String resolucao;
	private int TamanhoTela;
	
	
	
	Televisor(){}
	
	Televisor(String resolucao, int TamTela, String marca, String modelo, double preco){
		this.resolucao = resolucao;
		this.TamanhoTela = TamTela;
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
	}
	
	
	public String getResolucao() {
		return resolucao;
	}
	public void setResolucao(String resolucao) {
		this.resolucao = resolucao;
	}
	public int getTamanhoTela() {
		return TamanhoTela;
	}
	public void setTamanhoTela(int tamanhoTela) {
		TamanhoTela = tamanhoTela;
	}
	//metodo
	
	
	@Override
	public void exebirDetalhes() {
		System.out.println("Televisão");
		System.out.println("Marca: "+this.marca);
		System.out.println("Modelo: "+ this.modelo);
		System.out.print("Resolução: "+ this.resolucao + ", Pixels:" );
		reso();
		System.out.println("Tamanho da Tela: "+ this.TamanhoTela+" Polegadas.");
		System.out.println("Preço R$"+this.preco);
	}		
	
	public void reso() {
		 String pixels;
		
		if(this.resolucao.equals("4K")  || this.resolucao.equals("4k") || this.resolucao.equals("UHD") || this.resolucao.equals("uhd") ||this.resolucao.equals("ULTRA HD") || this.resolucao.equals("utra hd") ) {
			System.out.println( "3.840 x 2.160 ");
			
		}else if (this.resolucao.equals("2K") || this.resolucao.equals("2k") ||this.resolucao.equals("DCI") ||this.resolucao.equals("dci") ) {
			System.out.println(" 2560 x 1440 ");

		}else if(this.resolucao.equals("FULL HD") ||this.resolucao.equals("Full HD") || this.resolucao.equals("full hd") || this.resolucao.equals("1080p")) {
			System.out.println(" 1920 x 1080 ");

		}else if(this.resolucao.equals("HD") || this.resolucao.equals("hd") ||this.resolucao.equals("High Definition") ||this.resolucao.equals("720p") ) {
			System.out.println(" 1280 × 720 ");
		}//if
		
	}//meto


}//class
