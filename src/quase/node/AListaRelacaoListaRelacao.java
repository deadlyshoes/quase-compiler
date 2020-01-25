/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import java.util.*;
import quase.analysis.*;

public final class AListaRelacaoListaRelacao extends PListaRelacao
{
    private PRelacao _relacao_;
    private TEComercial _e_comercial_;

    public AListaRelacaoListaRelacao ()
    {
    }

    public AListaRelacaoListaRelacao (
            PRelacao _relacao_,
            TEComercial _e_comercial_
    )
    {
        setRelacao (_relacao_);
        setEComercial (_e_comercial_);
    }

    public Object clone()
    {
        return new AListaRelacaoListaRelacao (
            (PRelacao)cloneNode (_relacao_),
            (TEComercial)cloneNode (_e_comercial_)
        );
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAListaRelacaoListaRelacao(this);
    }

    public PRelacao getRelacao ()
    {
        return _relacao_;
    }

    public void setRelacao (PRelacao node)
    {
        if(_relacao_ != null)
        {
            _relacao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _relacao_ = node;
    }
    public TEComercial getEComercial ()
    {
        return _e_comercial_;
    }

    public void setEComercial (TEComercial node)
    {
        if(_e_comercial_ != null)
        {
            _e_comercial_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _e_comercial_ = node;
    }

    public String toString()
    {
        return ""
            + toString (_relacao_)
            + toString (_e_comercial_)
        ;
    }

    void removeChild(Node child)
    {
        if ( _relacao_ == child )
        {
            _relacao_ = null;
            return;
        }
        if ( _e_comercial_ == child )
        {
            _e_comercial_ = null;
            return;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if ( _relacao_ == oldChild )
        {
            setRelacao ((PRelacao) newChild);
            return;
        }
        if ( _e_comercial_ == oldChild )
        {
            setEComercial ((TEComercial) newChild);
            return;
        }
    }

}