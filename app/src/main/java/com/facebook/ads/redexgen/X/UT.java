package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class UT implements Q2 {
    public static String[] A01 = {"T9VzL8fHxpfySiwwlXedeY7mX", "guyVlBlOMcVDAIfN1wPFopCO0r0Zk0gq", "ttKJ4peW2WPtu1OROjgTykJGR", "A5J8ePX4fIk14ZpUSfaCkLGHXqqMAYt6", "kQp8myZeu", "7L0NbJj9RoUIRUZ", "UhNplE17b8XX", "zMftdbZDucx4tcPG97oOAYZ8vQU5TBbw"};
    public final /* synthetic */ UN A00;

    public UT(UN un) {
        this.A00 = un;
    }

    @Override // com.facebook.ads.redexgen.X.Q2
    public final void ACk() {
        AtomicBoolean atomicBoolean;
        InterfaceC1045Jy interfaceC1045Jy;
        InterfaceC1045Jy interfaceC1045Jy2;
        AtomicBoolean atomicBoolean2;
        atomicBoolean = this.A00.A0E;
        atomicBoolean.set(true);
        interfaceC1045Jy = this.A00.A02;
        if (interfaceC1045Jy != null) {
            interfaceC1045Jy2 = this.A00.A02;
            atomicBoolean2 = this.A00.A0D;
            boolean z10 = atomicBoolean2.get();
            if (A01[1].charAt(3) == 'h') {
                throw new RuntimeException();
            }
            A01[3] = "0cRb1Hjpfivo5OpVdykyl3dtou8RqpBl";
            interfaceC1045Jy2.ABk(z10);
        }
    }
}
