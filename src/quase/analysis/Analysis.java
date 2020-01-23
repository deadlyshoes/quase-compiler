/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.analysis;

import quase.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseTEComercial(TEComercial node);
    void caseTPontoVirgula(TPontoVirgula node);
    void caseTClasse(TClasse node);
    void caseTFilhaDaClasse(TFilhaDaClasse node);
    void caseTComeca(TComeca node);
    void caseTTermina(TTermina node);
    void caseTObjeto(TObjeto node);
    void caseTVirgula(TVirgula node);
    void caseTVariavel(TVariavel node);
    void caseTConstante(TConstante node);
    void caseTInicializacao(TInicializacao node);
    void caseTInt(TInt node);
    void caseTBool(TBool node);
    void caseTReal(TReal node);
    void caseTPontoDeEntrada(TPontoDeEntrada node);
    void caseTProcedimento(TProcedimento node);
    void caseTParentesesEsquerdo(TParentesesEsquerdo node);
    void caseTParentesesDireito(TParentesesDireito node);
    void caseTFuncao(TFuncao node);
    void caseTSe(TSe node);
    void caseTSenao(TSenao node);
    void caseTEnquanto(TEnquanto node);
    void caseTAtribuicao(TAtribuicao node);
    void caseTPonto(TPonto node);
    void caseTTrue(TTrue node);
    void caseTFalse(TFalse node);
    void caseTSubtracao(TSubtracao node);
    void caseTEntao(TEntao node);
    void caseTAdicao(TAdicao node);
    void caseTMultiplicacao(TMultiplicacao node);
    void caseTDivisao(TDivisao node);
    void caseTModulo(TModulo node);
    void caseTIgualdade(TIgualdade node);
    void caseTMenorQue(TMenorQue node);
    void caseTNegacao(TNegacao node);
    void caseTE(TE node);
    void caseTOu(TOu node);
    void caseTComentario(TComentario node);
    void caseTId(TId node);
    void caseTCid(TCid node);
    void caseTNumeroInteiro(TNumeroInteiro node);
    void caseTNumeroReal(TNumeroReal node);
    void caseTVazio(TVazio node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}