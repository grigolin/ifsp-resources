# IA — Classificação de imagens com CNN (Intel Image Classification)

Projeto prático de CNNs (BSI/IFSP) — **Guilherme Grigolin da Mata Brandão**

| Arquivo | Conteúdo |
|---|---|
| `projeto_cnn_intel.ipynb` | Notebook executado: preparação dos dados, CNN, experimentos E0–E7, avaliação final |
| `relatorio_cnn.pdf` | Relatório do projeto |
| `questionario_cnn_respostas.pdf` | Respostas do questionário |
| `resultados/split_*.csv` | Lista de arquivos de treino, validação e teste |
| `resultados/exclusoes.csv` | Arquivos excluídos (duplicatas) e motivo |
| `resultados/resultados_experimentos.csv` | Tabela de resultados dos experimentos |
| `resultados/historicos/` | Histórico por época de cada experimento |
| `resultados/figuras/` | Gráficos usados no relatório |
| `resultados/metricas_teste.csv`, `matriz_confusao_teste.csv` | Avaliação final no teste (modelo E7) |
| `notebook_base_aula.ipynb` | Notebook-base fornecido na disciplina |

## Resultado
Modelo selecionado: **E7** (4 blocos Conv + Dropout 0,3 + aumento de dados) — F1 macro de validação 0,8835;
no teste, acurácia **0,874** e F1 macro **0,875**.

O notebook foi executado no Google Colab (GPU T4). Os pesos treinados não estão no repositório: o runtime do Colab foi
reiniciado antes do download, e os demais artefatos de `resultados/` foram extraídos das saídas do notebook executado.
As listas `split_*.csv` foram regeneradas com o mesmo código, semente e versões de bibliotecas (contagens por classe e
imagens de exemplo conferidas como idênticas). A coluna `checkpoint` da tabela indica o arquivo usado na execução.

## Como executar
1. `pip install tensorflow kagglehub scikit-learn pandas matplotlib pillow imagehash`
2. Abra `projeto_cnn_intel.ipynb` (local, Colab ou Kaggle) e execute todas as células em ordem.
   A base é baixada automaticamente pelo `kagglehub` e os artefatos são gravados em `resultados/`.

Referência: [Intel Image Classification (CNN - Keras)](https://www.kaggle.com/code/vincee/intel-image-classification-cnn-keras), Vincenzooo (usuário `vincee`, Kaggle).
