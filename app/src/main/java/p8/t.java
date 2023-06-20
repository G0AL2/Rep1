package p8;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import ea.n0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: GaplessInfoHolder.java */
/* loaded from: classes2.dex */
public final class t {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f35693c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a  reason: collision with root package name */
    public int f35694a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f35695b = -1;

    private boolean b(String str) {
        Matcher matcher = f35693c.matcher(str);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt((String) n0.j(matcher.group(1)), 16);
                int parseInt2 = Integer.parseInt((String) n0.j(matcher.group(2)), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f35694a = parseInt;
                    this.f35695b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public boolean a() {
        return (this.f35694a == -1 || this.f35695b == -1) ? false : true;
    }

    public boolean c(Metadata metadata) {
        for (int i10 = 0; i10 < metadata.g(); i10++) {
            Metadata.Entry f10 = metadata.f(i10);
            if (f10 instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) f10;
                if ("iTunSMPB".equals(commentFrame.f21192c) && b(commentFrame.f21193d)) {
                    return true;
                }
            } else if (f10 instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) f10;
                if ("com.apple.iTunes".equals(internalFrame.f21199b) && "iTunSMPB".equals(internalFrame.f21200c) && b(internalFrame.f21201d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean d(int i10) {
        int i11 = i10 >> 12;
        int i12 = i10 & 4095;
        if (i11 > 0 || i12 > 0) {
            this.f35694a = i11;
            this.f35695b = i12;
            return true;
        }
        return false;
    }
}
