package com.guilherme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Usuario {
    private int anoNasc;
    private long cpf, tel, telEme;
    private String nome, end, email, cargo;

    public Usuario(int anoNasc, long cpf, long tel, long telEme, String nome, String end, String email, String cargo) {
        this.anoNasc = anoNasc;
        this.cpf = cpf;
        this.tel = tel;
        this.telEme = telEme;
        this.nome = nome;
        this.end = end;
        this.email = email;
        this.cargo = cargo;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public long getTelEme() {
        return telEme;
    }

    public void setTelEme(long telEme) {
        this.telEme = telEme;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "anoNasc=" + anoNasc +
                ", cpf=" + cpf +
                ", tel=" + tel +
                ", telEme=" + telEme +
                ", nome='" + nome + '\'' +
                ", end='" + end + '\'' +
                ", email='" + email + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}

class UsuarioPaciente extends Usuario {
    private char probMed, alergia, cirurgia;
    private String tpProbMed, tpAler, tpCir;

    public UsuarioPaciente(int anoNasc, long cpf, long tel, long telEme, String nome, String end, String email, String cargo,
                           char probMed, String tpProbMed, char alergia, String tpAler, char cirurgia, String tpCir) {
        super(anoNasc, cpf, tel, telEme, nome, end, email, cargo);
        this.probMed = probMed;
        this.tpProbMed = tpProbMed;
        this.alergia = alergia;
        this.tpAler = tpAler;
        this.cirurgia = cirurgia;
        this.tpCir = tpCir;
    }

    public char getProbMed() {
        return probMed;
    }

    public void setProbMed(char probMed) {
        this.probMed = probMed;
    }

    public String getTpProbMed() {
        return tpProbMed;
    }

    public void setTpProbMed(String tpProbMed) {
        this.tpProbMed = tpProbMed;
    }

    public char getAlergia() {
        return alergia;
    }

    public void setAlergia(char alergia) {
        this.alergia = alergia;
    }

    public String getTpAler() {
        return tpAler;
    }

    public void setTpAler(String tpAler) {
        this.tpAler = tpAler;
    }

    public char getCirurgia() {
        return cirurgia;
    }

    public void setCirurgia(char cirurgia) {
        this.cirurgia = cirurgia;
    }

    public String getTpCir() {
        return tpCir;
    }

    public void setTpCir(String tpCir) {
        this.tpCir = tpCir;
    }

    @Override
    public String toString() {
        return "UsuarioPaciente{" +
                "anoNasc=" + getAnoNasc() +
                ", cpf=" + getCpf() +
                ", tel=" + getTel() +
                ", telEme=" + getTelEme() +
                ", nome='" + getNome() + '\'' +
                ", end='" + getEnd() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", cargo='" + getCargo() + '\'' +
                ", probMed=" + probMed +
                ", tpProbMed='" + tpProbMed + '\'' +
                ", alergia=" + alergia +
                ", tpAler='" + tpAler + '\'' +
                ", cirurgia=" + cirurgia +
                ", tpCir='" + tpCir + '\'' +
                '}';
    }
}

public class Sistematizacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Usuario> usuarios = new ArrayList<>();

        while (true) {
            System.out.println("----Menu Principal----");
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Consultar Usuário por CPF");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarUsuario(scanner, usuarios);
                    break;
                case 2:
                    consultarUsuario(scanner, usuarios);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void cadastrarUsuario(Scanner scanner, List<Usuario> usuarios) {
        while (true) {
            System.out.println("----Cadastro de Usuario----");
            System.out.print("Ano de Nascimento: ");
            int anoNasc = scanner.nextInt();
            System.out.print("CPF: ");
            long cpf = scanner.nextLong();
            System.out.print("Telefone: ");
            long tel = scanner.nextLong();
            System.out.print("Telefone de Emergência: ");
            long telEme = scanner.nextLong();
            scanner.nextLine();
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Endereço: ");
            String end = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Cargo: ");
            String cargo = scanner.nextLine();

            System.out.print("Possui problemas médicos? (s/n): ");
            char probMed = scanner.next().charAt(0);
            scanner.nextLine();
            String tpProbMed = "";
            if (probMed == 's') {
                System.out.print("Tipo de Problema Médico: ");
                tpProbMed = scanner.nextLine();
            }

            System.out.print("Possui alergias? (s/n): ");
            char alergia = scanner.next().charAt(0);
            scanner.nextLine();
            String tpAler = "";
            if (alergia == 's') {
                System.out.print("Tipo de Alergia: ");
                tpAler = scanner.nextLine();
            }

            System.out.print("Já realizou cirurgias? (s/n): ");
            char cirurgia = scanner.next().charAt(0);
            scanner.nextLine();
            String tpCir = "";
            if (cirurgia == 's') {
                System.out.print("Tipo de Cirurgia: ");
                tpCir = scanner.nextLine();
            }

            Usuario usuario = new UsuarioPaciente(anoNasc, cpf, tel, telEme, nome, end, email, cargo, probMed, tpProbMed, alergia, tpAler, cirurgia, tpCir);
            usuarios.add(usuario);

            System.out.print("Deseja cadastrar outro usuário? (s/n): ");
            char continuar = scanner.next().charAt(0);
            if (continuar != 's') {
                break;
            }
            scanner.nextLine();
        }
    }

    private static void consultarUsuario(Scanner scanner, List<Usuario> usuarios) {
        while (true) {
            System.out.print("Digite o CPF do usuário que deseja consultar: ");
            long cpf = scanner.nextLong();

            Usuario usuarioEncontrado = null;
            for (Usuario usuario : usuarios) {
                if (usuario.getCpf() == cpf) {
                    usuarioEncontrado = usuario;
                    break;
                }
            }

            if (usuarioEncontrado != null) {
                System.out.println("\n--- Dados do Usuário ---");
                System.out.println("Ano de Nascimento: " + usuarioEncontrado.getAnoNasc());
                System.out.println("CPF: " + usuarioEncontrado.getCpf());
                System.out.println("Telefone: " + usuarioEncontrado.getTel());
                System.out.println("Telefone de Emergência: " + usuarioEncontrado.getTelEme());
                System.out.println("Nome: " + usuarioEncontrado.getNome());
                System.out.println("Endereço: " + usuarioEncontrado.getEnd());
                System.out.println("Email: " + usuarioEncontrado.getEmail());
                System.out.println("Cargo: " + usuarioEncontrado.getCargo());
                if (usuarioEncontrado instanceof UsuarioPaciente) {
                    UsuarioPaciente paciente = (UsuarioPaciente) usuarioEncontrado;
                    System.out.println("Possui problemas médicos? (s/n): " + paciente.getProbMed());
                    if (paciente.getProbMed() == 's') {
                        System.out.println("Tipo de Problema Médico: " + paciente.getTpProbMed());
                    }
                    System.out.println("Possui alergias? (s/n): " + paciente.getAlergia());
                    if (paciente.getAlergia() == 's') {
                        System.out.println("Tipo de Alergia: " + paciente.getTpAler());
                    }
                    System.out.println("Realizou cirurgias? (s/n): " + paciente.getCirurgia());
                    if (paciente.getCirurgia() == 's') {
                        System.out.println("Tipo de Cirurgia: " + paciente.getTpCir());
                    }
                }
            } else {
                System.out.println("Ainda não existe cadastro de pacientes");
            }

            System.out.print("\nDeseja consultar outro usuário? (s/n): ");
            char continuar = scanner.next().charAt(0);
            if (continuar != 's') {
                break;
            }
            scanner.nextLine();
        }
    }
}