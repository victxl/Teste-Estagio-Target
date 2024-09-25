import org.json.JSONArray;
import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Questao03 {
    public static void main(String[] args) {
        try {
            // Carregue o conteúdo do arquivo dados.json como String
            String dados = new String(Files.readAllBytes(Paths.get("dados.json")));

            // Converta a String JSON em um JSONArray
            JSONArray data = new JSONArray(dados);

            double menorValor = Double.MAX_VALUE;
            double maiorValor = Double.MIN_VALUE;
            double soma = 0.0;
            int count = 0;

            // Itere sobre os dados e faça os cálculos
            for (int i = 0; i < data.length(); i++) {
                JSONObject obj = data.getJSONObject(i);
                double valor = obj.getDouble("valor");

                if (valor > 0) {
                    if (valor < menorValor) menorValor = valor;
                    if (valor > maiorValor) maiorValor = valor;
                    soma += valor;
                    count++;
                }
            }

            double media = soma / count;
            int diasAcimaMedia = 0;

            for (int i = 0; i < data.length(); i++) {
                JSONObject obj = data.getJSONObject(i);
                double valor = obj.getDouble("valor");
                if (valor > media) diasAcimaMedia++;
            }

            // Exibir resultados
            System.out.println("Menor valor: " + menorValor);
            System.out.println("Maior valor: " + maiorValor);
            System.out.println("Dias com faturamento acima da média: " + diasAcimaMedia);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
