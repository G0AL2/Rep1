package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class FC extends AbstractC1575bx {
    public static TimeInterpolator A0B;
    public static String[] A0C = {"K3xavpXOVVnTPS8V8FmisIpuez1NdmFn", "QjoCrUVtXYT15qNhmppxWCsnlOvXMRWn", "HVYav4KnfeU3lAWSFDiSVAYelCZD7hW1", "SKhwmHHGUoQzTLK2kw5WKB1efbL3jYLm", "aZpNXGptJoOcjVlsPlgA0RFw1bcc4fI1", "y8DDj9eTKGlZyxtiH83YwnquX80t2qUq", "Eqht3urb", "PkOCx2w9GPXTa0iGANdHxOJetOGxrMw0"};
    public ArrayList<AbstractC06774l> A0A = new ArrayList<>();
    public ArrayList<AbstractC06774l> A07 = new ArrayList<>();
    public ArrayList<AnonymousClass41> A09 = new ArrayList<>();
    public ArrayList<AnonymousClass40> A08 = new ArrayList<>();
    public ArrayList<ArrayList<AbstractC06774l>> A01 = new ArrayList<>();
    public ArrayList<ArrayList<AnonymousClass41>> A05 = new ArrayList<>();
    public ArrayList<ArrayList<AnonymousClass40>> A03 = new ArrayList<>();
    public ArrayList<AbstractC06774l> A00 = new ArrayList<>();
    public ArrayList<AbstractC06774l> A04 = new ArrayList<>();
    public ArrayList<AbstractC06774l> A06 = new ArrayList<>();
    public ArrayList<AbstractC06774l> A02 = new ArrayList<>();

    private void A01(AnonymousClass40 anonymousClass40) {
        if (anonymousClass40.A05 != null) {
            A07(anonymousClass40, anonymousClass40.A05);
        }
        if (anonymousClass40.A04 != null) {
            A07(anonymousClass40, anonymousClass40.A04);
        }
    }

    private void A03(final AbstractC06774l abstractC06774l) {
        final View view = abstractC06774l.A0H;
        final ViewPropertyAnimator animate = view.animate();
        this.A06.add(abstractC06774l);
        animate.setDuration(A07()).alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3v
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                view.setAlpha(1.0f);
                FC.this.A0P(abstractC06774l);
                FC.this.A06.remove(abstractC06774l);
                FC.this.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }

    private void A04(AbstractC06774l abstractC06774l) {
        if (A0B == null) {
            A0B = new ValueAnimator().getInterpolator();
        }
        abstractC06774l.A0H.animate().setInterpolator(A0B);
        A0K(abstractC06774l);
    }

    private final void A05(List<AbstractC06774l> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).A0H.animate().cancel();
        }
    }

    private void A06(List<AnonymousClass40> list, AbstractC06774l abstractC06774l) {
        for (int size = list.size() - 1; size >= 0; size--) {
            AnonymousClass40 anonymousClass40 = list.get(size);
            if (A07(anonymousClass40, abstractC06774l) && anonymousClass40.A05 == null && anonymousClass40.A04 == null) {
                list.remove(anonymousClass40);
            }
        }
    }

    private boolean A07(AnonymousClass40 anonymousClass40, AbstractC06774l abstractC06774l) {
        boolean z10 = false;
        if (anonymousClass40.A04 == abstractC06774l) {
            anonymousClass40.A04 = null;
        } else if (anonymousClass40.A05 == abstractC06774l) {
            anonymousClass40.A05 = null;
            z10 = true;
        } else {
            return false;
        }
        abstractC06774l.A0H.setAlpha(1.0f);
        abstractC06774l.A0H.setTranslationX(0.0f);
        abstractC06774l.A0H.setTranslationY(0.0f);
        A0Q(abstractC06774l, z10);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.C4P
    public final void A0I() {
        for (int size = this.A09.size() - 1; size >= 0; size--) {
            AnonymousClass41 anonymousClass41 = this.A09.get(size);
            View view = anonymousClass41.A04.A0H;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            A0O(anonymousClass41.A04);
            this.A09.remove(size);
        }
        for (int size2 = this.A0A.size() - 1; size2 >= 0; size2--) {
            A0P(this.A0A.get(size2));
            this.A0A.remove(size2);
        }
        for (int size3 = this.A07.size() - 1; size3 >= 0; size3--) {
            AbstractC06774l abstractC06774l = this.A07.get(size3);
            abstractC06774l.A0H.setAlpha(1.0f);
            A0N(abstractC06774l);
            this.A07.remove(size3);
        }
        for (int size4 = this.A08.size() - 1; size4 >= 0; size4--) {
            A01(this.A08.get(size4));
        }
        this.A08.clear();
        if (!A0L()) {
            return;
        }
        int listCount = this.A05.size();
        for (int i10 = listCount - 1; i10 >= 0; i10--) {
            ArrayList<AnonymousClass41> arrayList = this.A05.get(i10);
            int listCount2 = arrayList.size();
            for (int i11 = listCount2 - 1; i11 >= 0; i11--) {
                AnonymousClass41 moveInfo = arrayList.get(i11);
                View view2 = moveInfo.A04.A0H;
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                A0O(moveInfo.A04);
                arrayList.remove(i11);
                if (arrayList.isEmpty()) {
                    this.A05.remove(arrayList);
                }
            }
        }
        for (int size5 = this.A01.size() - 1; size5 >= 0; size5--) {
            ArrayList<AbstractC06774l> arrayList2 = this.A01.get(size5);
            int i12 = arrayList2.size();
            for (int i13 = i12 - 1; i13 >= 0; i13--) {
                AbstractC06774l item = arrayList2.get(i13);
                item.A0H.setAlpha(1.0f);
                A0N(item);
                arrayList2.remove(i13);
                if (arrayList2.isEmpty()) {
                    this.A01.remove(arrayList2);
                }
            }
        }
        for (int size6 = this.A03.size() - 1; size6 >= 0; size6--) {
            ArrayList<AnonymousClass40> arrayList3 = this.A03.get(size6);
            int j10 = arrayList3.size();
            for (int i14 = j10 - 1; i14 >= 0; i14--) {
                A01(arrayList3.get(i14));
                if (arrayList3.isEmpty()) {
                    this.A03.remove(arrayList3);
                }
            }
        }
        A05(this.A06);
        A05(this.A04);
        A05(this.A00);
        A05(this.A02);
        A0A();
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x0033 */
    @Override // com.facebook.ads.redexgen.X.C4P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0J() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.FC.A0J():void");
    }

    @Override // com.facebook.ads.redexgen.X.C4P
    public final void A0K(AbstractC06774l abstractC06774l) {
        View view = abstractC06774l.A0H;
        view.animate().cancel();
        for (int size = this.A09.size() - 1; size >= 0; size--) {
            AnonymousClass41 moveInfo = this.A09.get(size);
            if (moveInfo.A04 == abstractC06774l) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                A0O(abstractC06774l);
                this.A09.remove(size);
            }
        }
        A06(this.A08, abstractC06774l);
        if (this.A0A.remove(abstractC06774l)) {
            view.setAlpha(1.0f);
            A0P(abstractC06774l);
        }
        if (this.A07.remove(abstractC06774l)) {
            view.setAlpha(1.0f);
            A0N(abstractC06774l);
        }
        for (int size2 = this.A03.size() - 1; size2 >= 0; size2--) {
            ArrayList<AnonymousClass40> arrayList = this.A03.get(size2);
            A06(arrayList, abstractC06774l);
            if (arrayList.isEmpty()) {
                this.A03.remove(size2);
            }
        }
        for (int size3 = this.A05.size() - 1; size3 >= 0; size3--) {
            ArrayList<AnonymousClass41> arrayList2 = this.A05.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).A04 == abstractC06774l) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    String[] strArr = A0C;
                    String str = strArr[4];
                    String str2 = strArr[3];
                    int charAt = str.charAt(9);
                    int j10 = str2.charAt(9);
                    if (charAt != j10) {
                        throw new RuntimeException();
                    }
                    A0C[1] = "ZnQkkSK02m4qlFQsfXGc8k1uWyp7aRL1";
                    A0O(abstractC06774l);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.A05.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        int size5 = this.A01.size();
        if (A0C[0].charAt(3) == 'S') {
            throw new RuntimeException();
        }
        A0C[7] = "NHib0yCpDtVNZGbvtAXjIsv6RzrfBwwf";
        for (int i10 = size5 - 1; i10 >= 0; i10--) {
            ArrayList<AbstractC06774l> arrayList3 = this.A01.get(i10);
            if (arrayList3.remove(abstractC06774l)) {
                view.setAlpha(1.0f);
                A0N(abstractC06774l);
                if (arrayList3.isEmpty()) {
                    this.A01.remove(i10);
                }
            }
        }
        this.A06.remove(abstractC06774l);
        this.A00.remove(abstractC06774l);
        this.A02.remove(abstractC06774l);
        this.A04.remove(abstractC06774l);
        A0V();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
        if (r4.A02.isEmpty() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
        if (r4.A05.isEmpty() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0089, code lost:
        if (r4.A01.isEmpty() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
        r3 = r4.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
        if (com.facebook.ads.redexgen.X.FC.A0C[7].charAt(30) == 'w') goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a1, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a2, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ab, code lost:
        com.facebook.ads.redexgen.X.FC.A0C[7] = "80rjjAfjuSoUPBYOWBOUrC4mhnJBtDwK";
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b6, code lost:
        if (r3.isEmpty() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ba, code lost:
        return false;
     */
    @Override // com.facebook.ads.redexgen.X.C4P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0L() {
        /*
            r4 = this;
            java.util.ArrayList<com.facebook.ads.redexgen.X.4l> r0 = r4.A07
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.40> r0 = r4.A08
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.41> r0 = r4.A09
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.4l> r0 = r4.A0A
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.4l> r0 = r4.A04
            boolean r3 = r0.isEmpty()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.FC.A0C
            r0 = 2
            r1 = r2[r0]
            r0 = 5
            r2 = r2[r0]
            r0 = 18
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto La5
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.FC.A0C
            java.lang.String r1 = "HATKbuX1ioRbKjbJza4uRkbMkwnilInw"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "55W5G9gSwoJRpeM2nuMk9rdzPBhIsXI5"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.4l> r0 = r4.A06
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.4l> r0 = r4.A00
            boolean r3 = r0.isEmpty()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.FC.A0C
            r0 = 2
            r1 = r2[r0]
            r0 = 5
            r2 = r2[r0]
            r0 = 18
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto La2
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.FC.A0C
            java.lang.String r1 = "PBqWGImhwZdo7IXQpaNFK9QlBHxMp4wk"
            r0 = 7
            r2[r0] = r1
            if (r3 == 0) goto Lb8
        L73:
            java.util.ArrayList<com.facebook.ads.redexgen.X.4l> r0 = r4.A02
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<java.util.ArrayList<com.facebook.ads.redexgen.X.41>> r0 = r4.A05
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<java.util.ArrayList<com.facebook.ads.redexgen.X.4l>> r0 = r4.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<java.util.ArrayList<com.facebook.ads.redexgen.X.40>> r3 = r4.A03
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.FC.A0C
            r0 = 7
            r1 = r1[r0]
            r0 = 30
            char r1 = r1.charAt(r0)
            r0 = 119(0x77, float:1.67E-43)
            if (r1 == r0) goto Lab
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        La2:
            if (r3 == 0) goto Lb8
            goto L73
        La5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        Lab:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.FC.A0C
            java.lang.String r1 = "80rjjAfjuSoUPBYOWBOUrC4mhnJBtDwK"
            r0 = 7
            r2[r0] = r1
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto Lba
        Lb8:
            r0 = 1
        Lb9:
            return r0
        Lba:
            r0 = 0
            goto Lb9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.FC.A0L():boolean");
    }

    @Override // com.facebook.ads.redexgen.X.C4P
    public final boolean A0M(@NonNull AbstractC06774l abstractC06774l, @NonNull List<Object> list) {
        return !list.isEmpty() || super.A0M(abstractC06774l, list);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1575bx
    public final boolean A0R(AbstractC06774l abstractC06774l) {
        A04(abstractC06774l);
        abstractC06774l.A0H.setAlpha(0.0f);
        this.A07.add(abstractC06774l);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1575bx
    public final boolean A0S(AbstractC06774l abstractC06774l) {
        A04(abstractC06774l);
        this.A0A.add(abstractC06774l);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1575bx
    public final boolean A0T(AbstractC06774l abstractC06774l, int i10, int i11, int i12, int i13) {
        View view = abstractC06774l.A0H;
        int deltaY = i10 + ((int) abstractC06774l.A0H.getTranslationX());
        int fromX = (int) abstractC06774l.A0H.getTranslationY();
        int i14 = i11 + fromX;
        A04(abstractC06774l);
        int fromY = i12 - deltaY;
        int i15 = i13 - i14;
        if (fromY == 0 && i15 == 0) {
            A0O(abstractC06774l);
            return false;
        }
        if (fromY != 0) {
            int deltaX = -fromY;
            view.setTranslationX(deltaX);
        }
        if (i15 != 0) {
            int deltaX2 = -i15;
            view.setTranslationY(deltaX2);
        }
        this.A09.add(new AnonymousClass41(abstractC06774l, deltaY, i14, i12, i13));
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1575bx
    public final boolean A0U(AbstractC06774l abstractC06774l, AbstractC06774l abstractC06774l2, int deltaX, int deltaY, int i10, int i11) {
        if (abstractC06774l == abstractC06774l2) {
            return A0T(abstractC06774l, deltaX, deltaY, i10, i11);
        }
        float translationX = abstractC06774l.A0H.getTranslationX();
        float translationY = abstractC06774l.A0H.getTranslationY();
        float alpha = abstractC06774l.A0H.getAlpha();
        A04(abstractC06774l);
        int i12 = (int) ((i10 - deltaX) - translationX);
        int i13 = (int) ((i11 - deltaY) - translationY);
        abstractC06774l.A0H.setTranslationX(translationX);
        abstractC06774l.A0H.setTranslationY(translationY);
        abstractC06774l.A0H.setAlpha(alpha);
        if (abstractC06774l2 != null) {
            A04(abstractC06774l2);
            abstractC06774l2.A0H.setTranslationX(-i12);
            abstractC06774l2.A0H.setTranslationY(-i13);
            abstractC06774l2.A0H.setAlpha(0.0f);
        }
        this.A08.add(new AnonymousClass40(abstractC06774l, abstractC06774l2, deltaX, deltaY, i10, i11));
        return true;
    }

    public final void A0V() {
        if (!A0L()) {
            A0A();
        }
    }

    public final void A0W(final AnonymousClass40 anonymousClass40) {
        final View view;
        AbstractC06774l abstractC06774l = anonymousClass40.A05;
        if (abstractC06774l == null) {
            view = null;
        } else {
            view = abstractC06774l.A0H;
        }
        AbstractC06774l abstractC06774l2 = anonymousClass40.A04;
        final View view2 = abstractC06774l2 != null ? abstractC06774l2.A0H : null;
        if (view != null) {
            final ViewPropertyAnimator duration = view.animate().setDuration(A05());
            this.A02.add(anonymousClass40.A05);
            duration.translationX(anonymousClass40.A02 - anonymousClass40.A00);
            duration.translationY(anonymousClass40.A03 - anonymousClass40.A01);
            ViewPropertyAnimator oldViewAnim = duration.alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3y
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    duration.setListener(null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    FC.this.A0Q(anonymousClass40.A05, true);
                    FC.this.A02.remove(anonymousClass40.A05);
                    FC.this.A0V();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            });
            oldViewAnim.start();
        }
        if (view2 != null) {
            final ViewPropertyAnimator animate = view2.animate();
            this.A02.add(anonymousClass40.A04);
            ViewPropertyAnimator newViewAnimation = animate.translationX(0.0f);
            newViewAnimation.translationY(0.0f).setDuration(A05()).alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3z
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    animate.setListener(null);
                    view2.setAlpha(1.0f);
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(0.0f);
                    FC.this.A0Q(anonymousClass40.A04, false);
                    FC.this.A02.remove(anonymousClass40.A04);
                    FC.this.A0V();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            }).start();
        }
    }

    public final void A0X(final AbstractC06774l abstractC06774l) {
        final View view = abstractC06774l.A0H;
        final ViewPropertyAnimator animate = view.animate();
        this.A00.add(abstractC06774l);
        animate.alpha(1.0f).setDuration(A04()).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3w
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                view.setAlpha(1.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                FC.this.A0N(abstractC06774l);
                FC.this.A00.remove(abstractC06774l);
                FC.this.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }

    public final void A0Y(final AbstractC06774l abstractC06774l, int i10, int i11, int i12, int deltaX) {
        final View view = abstractC06774l.A0H;
        final int i13 = i12 - i10;
        final int deltaX2 = deltaX - i11;
        if (i13 != 0) {
            view.animate().translationX(0.0f);
        }
        if (deltaX2 != 0) {
            view.animate().translationY(0.0f);
        }
        final ViewPropertyAnimator animate = view.animate();
        this.A04.add(abstractC06774l);
        ViewPropertyAnimator animation = animate.setDuration(A06());
        animation.setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3x
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                if (i13 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (deltaX2 != 0) {
                    view.setTranslationY(0.0f);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                FC.this.A0O(abstractC06774l);
                FC.this.A04.remove(abstractC06774l);
                FC.this.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }
}
