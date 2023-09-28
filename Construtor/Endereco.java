package Construtor; 

public class Endereco { 

	private long id; 
	private String logradouro; 
	private String numero; 
	private String complemento; 
	private String bairro;
	private String cidade;
	private String uf;

    public Endereco () { 
    } 
    public Endereco (String nome) { 
    } 
    public Endereco (long id, String logradouro, String numero, String complemento, String bairro, String cidade, String uf) { 
    	this.id = id; 
    	this.logradouro = logradouro; 
    	this.numero = numero; 
    	this.complemento = complemento; 
    	this.bairro = bairro; 
    	this.cidade = cidade; 
    	this.uf = uf; 
    } 
    public long getid() { 
    	return id; 
    }
    public void setid(long id) { 
    	this.id = id; 
    }
    public String gelogradouro() { 
    	return logradouro; 
    }
    public void setlogradouro(String logradouro) { 
    	this.logradouro = logradouro; 
    }
    public String getnumero() { 
    	return numero; 
    }
    public void setnumero(String string) { 
    	this.numero = string; 
    }
    public String getcomplemento() { 
    	return complemento; 
    }
    public void setcomplemento(String complemento) { 
    	this.complemento = complemento; 
    }
    public String getbairro() { 
    	return bairro; 
    }
    public void setbairro(String bairro) { 
    	this.bairro = bairro; 
    }
    public String getcidade() { 
    	return cidade; 
    }
    public void setcidade(String cidade) { 
    	this.cidade = cidade; 
    }
    public String getuf() { 
    	return uf; 
    }
    public void setuf(String uf) { 
    	this.uf = uf; 
    }
}



