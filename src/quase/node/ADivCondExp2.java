/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import java.util.*;
import quase.analysis.*;

public final class ADivCondExp2 extends PCondExp2
{
    private PTermo _termo_;
    private TDivisao _divisao_;
    private PCondExp2 _cond_exp2_;

    public ADivCondExp2 ()
    {
    }

    public ADivCondExp2 (
            PTermo _termo_,
            TDivisao _divisao_,
            PCondExp2 _cond_exp2_
    )
    {
        setTermo (_termo_);
        setDivisao (_divisao_);
        setCondExp2 (_cond_exp2_);
    }

    public Object clone()
    {
        return new ADivCondExp2 (
            (PTermo)cloneNode (_termo_),
            (TDivisao)cloneNode (_divisao_),
            (PCondExp2)cloneNode (_cond_exp2_)
        );
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADivCondExp2(this);
    }

    public PTermo getTermo ()
    {
        return _termo_;
    }

    public void setTermo (PTermo node)
    {
        if(_termo_ != null)
        {
            _termo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _termo_ = node;
    }
    public TDivisao getDivisao ()
    {
        return _divisao_;
    }

    public void setDivisao (TDivisao node)
    {
        if(_divisao_ != null)
        {
            _divisao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _divisao_ = node;
    }
    public PCondExp2 getCondExp2 ()
    {
        return _cond_exp2_;
    }

    public void setCondExp2 (PCondExp2 node)
    {
        if(_cond_exp2_ != null)
        {
            _cond_exp2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _cond_exp2_ = node;
    }

    public String toString()
    {
        return ""
            + toString (_termo_)
            + toString (_divisao_)
            + toString (_cond_exp2_)
        ;
    }

    void removeChild(Node child)
    {
        if ( _termo_ == child )
        {
            _termo_ = null;
            return;
        }
        if ( _divisao_ == child )
        {
            _divisao_ = null;
            return;
        }
        if ( _cond_exp2_ == child )
        {
            _cond_exp2_ = null;
            return;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if ( _termo_ == oldChild )
        {
            setTermo ((PTermo) newChild);
            return;
        }
        if ( _divisao_ == oldChild )
        {
            setDivisao ((TDivisao) newChild);
            return;
        }
        if ( _cond_exp2_ == oldChild )
        {
            setCondExp2 ((PCondExp2) newChild);
            return;
        }
    }

}