package f9;

import c9.f;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import ib.b;
import ib.d;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: IcyDecoder.java */
/* loaded from: classes2.dex */
public final class a extends f {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f30197c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a  reason: collision with root package name */
    private final CharsetDecoder f30198a = d.f31905c.newDecoder();

    /* renamed from: b  reason: collision with root package name */
    private final CharsetDecoder f30199b = d.f31904b.newDecoder();

    private String c(ByteBuffer byteBuffer) {
        try {
            return this.f30198a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                return this.f30199b.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                return null;
            } finally {
                this.f30199b.reset();
                byteBuffer.rewind();
            }
        } finally {
            this.f30198a.reset();
            byteBuffer.rewind();
        }
    }

    @Override // c9.f
    protected Metadata b(c9.d dVar, ByteBuffer byteBuffer) {
        String c10 = c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (c10 == null) {
            return new Metadata(new IcyInfo(bArr, null, null));
        }
        Matcher matcher = f30197c.matcher(c10);
        String str2 = null;
        for (int i10 = 0; matcher.find(i10); i10 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String e10 = b.e(group);
                e10.hashCode();
                if (e10.equals("streamurl")) {
                    str2 = group2;
                } else if (e10.equals("streamtitle")) {
                    str = group2;
                }
            }
        }
        return new Metadata(new IcyInfo(bArr, str, str2));
    }
}
