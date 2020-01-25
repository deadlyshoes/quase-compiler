/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import java.util.*;
import quase.analysis.*;

public final class AParametrosParametros extends PParametros
{
    private PListaParametro _lista_parametro_;

    public AParametrosParametros ()
    {
    }

    public AParametrosParametros (
            PListaParametro _lista_parametro_
    )
    {
        setListaParametro (_lista_parametro_);
    }

    public Object clone()
    {
        return new AParametrosParametros (
            (PListaParametro)cloneNode (_lista_parametro_)
        );
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParametrosParametros(this);
    }

    public PListaParametro getListaParametro ()
    {
        return _lista_parametro_;
    }

    public void setListaParametro (PListaParametro node)
    {
        if(_lista_parametro_ != null)
        {
            _lista_parametro_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _lista_parametro_ = node;
    }

    public String toString()
    {
        return ""
            + toString (_lista_parametro_)
        ;
    }

    void removeChild(Node child)
    {
        if ( _lista_parametro_ == child )
        {
            _lista_parametro_ = null;
            return;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if ( _lista_parametro_ == oldChild )
        {
            setListaParametro ((PListaParametro) newChild);
            return;
        }
    }

}