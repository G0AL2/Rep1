package com.google.android.exoplayer2.metadata.emsg;

import com.google.android.gms.ads.AdRequest;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: EventMessageEncoder.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final ByteArrayOutputStream f21154a;

    /* renamed from: b  reason: collision with root package name */
    private final DataOutputStream f21155b;

    public a() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(AdRequest.MAX_CONTENT_URL_LENGTH);
        this.f21154a = byteArrayOutputStream;
        this.f21155b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(EventMessage eventMessage) {
        this.f21154a.reset();
        try {
            b(this.f21155b, eventMessage.f21148a);
            String str = eventMessage.f21149b;
            if (str == null) {
                str = "";
            }
            b(this.f21155b, str);
            this.f21155b.writeLong(eventMessage.f21150c);
            this.f21155b.writeLong(eventMessage.f21151d);
            this.f21155b.write(eventMessage.f21152e);
            this.f21155b.flush();
            return this.f21154a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
