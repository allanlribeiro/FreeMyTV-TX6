# Free My TV — TX6 experimental

App de teste para Android TV, instalado como aplicativo comum, **sem substituir o launcher**.

## O que está implementado
- Layout branco inspirado no desenho aprovado, com navegação via D-pad
- Abas Explorar, Filmes, Séries, Esportes e Apps (sem Infantil)
- Filmes/séries reais do TMDB, quando o usuário informa a própria chave em Configurações
- Listagem e abertura dos aplicativos instalados
- Previsão real para cinco dias via Open-Meteo, com latitude/longitude configuráveis
- Esportes em cinco linhas: Futebol, Tênis, NBA, Fórmula 1 e UFC

## Limitações da versão
- Notícias e calendários esportivos ao vivo **ainda não integrados**
- Próximos jogos de São Paulo FC e Flamengo **ainda não integrados**
- Continuar assistindo entre aplicativos precisa de integração específica
- TV aberta usa uma tentativa via intent do Android; compatibilidade depende do firmware
- Atalho HDMI ainda não faz seleção real da entrada (varia conforme a TV Box)
- Identidade visual baseada no protótipo, ainda pendente de validação na TX6
- Não é uma modificação nem um fork do código-fonte do Free My TV de SimbasJungles; é um protótipo independente para testes

## Compilação
GitHub Actions > **Gerar APK TX6** > execução mais recente. Após execução bem-sucedida, baixar o artefato `FreeMyTV-TX6-v04-debug-apk`. Extrair `app-debug.apk`.

## Instalação na TX6
No PowerShell, na pasta platform-tools e com ADB ativo:
```powershell
.\adb.exe -s 192.168.0.106:5555 install -r "CAMINHO_COMPLETO_DO_APK"
```

A instalação não altera as configurações da TCL nem substitui a tela inicial da TX6.
