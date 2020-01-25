/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import java.util.*;
import quase.analysis.*;

public final class ATermoExp extends PExp
{
    private PTermo _termo_;

    public ATermoExp ()
    {
    }

    public ATermoExp (
            PTermo _termo_
    )
    {
        setTermo (_termo_);
    }

    public Object clone()
    {
        return new ATermoExp (
            (PTermo)cloneNode (_termo_)
        );
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATermoExp(this);
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

    public String toString()
    {
        return ""
            + toString (_termo_)
        ;
    }

    void removeChild(Node child)
    {
        if ( _termo_ == child )
        {
            _termo_ = null;
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
    }

}