package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class XM implements InterfaceC07989q {
    public final List<C08039v> A00 = new ArrayList();
    public final boolean A01;
    public final /* synthetic */ XL A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XM != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    public XM(XL xl, List<C07949m> list, boolean z10) throws IOException {
        this.A02 = xl;
        this.A01 = z10;
        for (C07949m c07949m : list) {
            C9l A01 = c07949m.A01();
            this.A00.add(new C08039v(new C07929j(c07949m.A00(), A01.A01()), A01.A00() - A01.A01(), A01.A00()));
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XM != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    public final C08039v A00() {
        return this.A00.get(0);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XM != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    public final C08039v A01() {
        List<C08039v> list = this.A00;
        return list.get(list.size() - 1);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XM != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // com.facebook.ads.redexgen.X.InterfaceC07989q
    public final void A4i() throws A0 {
        this.A02.A03(this);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XM != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // com.facebook.ads.redexgen.X.InterfaceC07989q
    public final synchronized int A5N() {
        int i10;
        i10 = 0;
        for (C08039v location : this.A00) {
            i10 += location.A01;
        }
        return i10;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XM != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // com.facebook.ads.redexgen.X.InterfaceC07989q
    public final boolean A9V() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XM != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A02.A06(this);
    }
}
