package com.exemplo.modular.utils;

import com.exemplo.modular.utils.internal.DivHelper;
import com.exemplo.modular.utils.internal.MuiltHelper;
import com.exemplo.modular.utils.internal.SubHelper;
import com.exemplo.modular.utils.internal.SumHelper;

public class Calculadora {

    private DivHelper divHelper;
    private MuiltHelper muiltHelper;
    private SubHelper subHelper;
    private SumHelper sumHelper;

    public Calculadora(){
        divHelper = new DivHelper();
        muiltHelper = new MuiltHelper();
        subHelper = new SubHelper();
        sumHelper = new SumHelper();
    }

    public int sum(int a, int b){
        return sumHelper.execute(a, b);
    }

    public int sub(int a, int b){
        return subHelper.execute(a, b);
    }

    public int muilt(int a, int b){
        return muiltHelper.execute(a, b);
    }

    public int div(int a, int b){
        return divHelper.execute(a, b);
    }
}
