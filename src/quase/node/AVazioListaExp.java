/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import java.util.*;
import quase.analysis.*;

public final class AVazioListaExp extends PListaExp
{


    public AVazioListaExp (
    )
    {
    }

    public Object clone()
    {
        return new AVazioListaExp (
        );
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVazioListaExp(this);
    }


    public String toString()
    {
        return ""
        ;
    }

    void removeChild(Node child)
    {
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

}