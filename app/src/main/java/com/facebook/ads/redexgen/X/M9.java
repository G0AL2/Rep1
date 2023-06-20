package com.facebook.ads.redexgen.X;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.io.Writer;

/* loaded from: assets/audience_network.dex */
public class M9 extends Writer {
    public static String[] A03 = {"m3VYVt1tyYlWEg8H2HS3pUr0VsrhpbIN", "rEdvzR", "IUQqTrakmjCy7RtoUebGZ8YLkwuKbv7t", "x1ufNW", "e7NtJ1", "AK7iWzpXctzvcUrQA38QQTSmPkrm2HP", "25DCnOqD1cr08G9nl6wTfczykol7NaSA", "0bM1VBntYb2o4FFsMu8yzxmwObMsLmHM"};
    public int A00;
    public char[] A01 = new char[IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES];
    public final M8 A02;

    public M9(M8 m82) {
        this.A02 = m82;
    }

    private void A00() {
        this.A02.ADK(new String(this.A01, 0, this.A00));
        this.A00 = 0;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        flush();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        if (this.A00 > 0) {
            A00();
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) throws IOException {
        int i12 = i10;
        while (true) {
            int i13 = i10 + i11;
            String[] strArr = A03;
            if (strArr[3].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A03[5] = "5m1TKypG4e5yu";
            if (i12 < i13) {
                if (cArr[i12] != '\n') {
                    int i14 = this.A00;
                    char[] cArr2 = this.A01;
                    if (i14 != cArr2.length) {
                        cArr2[i14] = cArr[i12];
                        this.A00 = i14 + 1;
                        i12++;
                    }
                }
                A00();
                i12++;
            } else {
                return;
            }
        }
    }
}
