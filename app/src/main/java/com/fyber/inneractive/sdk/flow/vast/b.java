package com.fyber.inneractive.sdk.flow.vast;

import java.util.Comparator;

/* loaded from: classes.dex */
public class b implements Comparator<com.fyber.inneractive.sdk.model.vast.c> {

    /* renamed from: a  reason: collision with root package name */
    public int f17308a;

    /* renamed from: b  reason: collision with root package name */
    public int f17309b;

    public b(int i10, int i11) {
        this.f17308a = i10;
        this.f17309b = i11;
    }

    public Integer a(com.fyber.inneractive.sdk.model.vast.c cVar) {
        com.fyber.inneractive.sdk.model.vast.g gVar = cVar.f17395a;
        if (gVar == com.fyber.inneractive.sdk.model.vast.g.Html) {
            return 3;
        }
        if (gVar == com.fyber.inneractive.sdk.model.vast.g.Iframe) {
            return 2;
        }
        if (gVar == com.fyber.inneractive.sdk.model.vast.g.Static) {
            return 1;
        }
        return -1;
    }

    @Override // java.util.Comparator
    public int compare(com.fyber.inneractive.sdk.model.vast.c cVar, com.fyber.inneractive.sdk.model.vast.c cVar2) {
        com.fyber.inneractive.sdk.model.vast.c cVar3 = cVar;
        com.fyber.inneractive.sdk.model.vast.c cVar4 = cVar2;
        int i10 = cVar3.f17397c * cVar3.f17398d;
        int i11 = cVar4.f17397c * cVar4.f17398d;
        int i12 = this.f17308a * this.f17309b;
        int abs = Math.abs(i10 - i12);
        int abs2 = Math.abs(i11 - i12);
        if (abs >= abs2) {
            if (abs <= abs2) {
                float floatValue = Float.valueOf(this.f17308a).floatValue() / Float.valueOf(this.f17309b).floatValue();
                float abs3 = Math.abs(floatValue - (Float.valueOf(cVar3.f17397c).floatValue() / Float.valueOf(cVar3.f17398d).floatValue()));
                float abs4 = Math.abs(floatValue - (Float.valueOf(cVar4.f17397c).floatValue() / Float.valueOf(cVar4.f17398d).floatValue()));
                if (abs3 >= abs4) {
                    if (abs3 <= abs4) {
                        int compareTo = a(cVar4).compareTo(a(cVar3));
                        if (compareTo != 0) {
                            return compareTo;
                        }
                        return 0;
                    }
                }
            }
            return 1;
        }
        return -1;
    }
}
