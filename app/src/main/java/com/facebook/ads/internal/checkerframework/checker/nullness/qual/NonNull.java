package com.facebook.ads.internal.checkerframework.checker.nullness.qual;

import com.facebook.ads.internal.checkerframework.framework.qual.DefaultFor;
import com.facebook.ads.internal.checkerframework.framework.qual.DefaultInUncheckedCodeFor;
import com.facebook.ads.internal.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import com.facebook.ads.internal.checkerframework.framework.qual.QualifierForLiterals;
import com.facebook.ads.internal.checkerframework.framework.qual.SubtypeOf;
import com.facebook.ads.internal.checkerframework.framework.qual.UpperBoundFor;
import com.facebook.ads.redexgen.X.C8A;
import com.facebook.ads.redexgen.X.C8O;
import com.facebook.ads.redexgen.X.C8P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@SubtypeOf({MonotonicNonNull.class})
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@UpperBoundFor(typeKinds = {C8O.A0I, C8O.A0C, C8O.A04, C8O.A06, C8O.A08, C8O.A0B, C8O.A0E, C8O.A0J, C8O.A05})
@Retention(RetentionPolicy.RUNTIME)
@QualifierForLiterals({C8A.A0B})
@DefaultFor({C8P.A05})
@DefaultQualifierInHierarchy
@DefaultInUncheckedCodeFor({C8P.A0E, C8P.A0C})
@Documented
/* loaded from: assets/audience_network.dex */
public @interface NonNull {
}
