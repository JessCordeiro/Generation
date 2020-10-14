
public class Funcionario {
	
	String cargo;
	String setor;
	double salario;
	
	
	public String getCargo() {
		return cargo;
	}
	 public void setCargo(String cargo) {
	        this.cargo = cargo;
	 }
	
	public String getSetor() {
		return setor;
	}
	
	public void setSetor(String setor) {
        this.setor = setor;
    }
	
	public double getSalario() {
		return salario;
	}
	 public void setSalario(Double salario) {
	        this.salario = salario;
	    }
	 
	 public String toString() {
	        return "Cargo: " + cargo + "  Setor: " + setor + " Salário: "+ salario; 
	   }
}
