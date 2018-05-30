package com.majian.utils.mask.annotations;

import com.majian.utils.mask.masker.NameMasker;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by majian on 2017/12/19.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Mask(NameMasker.class)
public @interface NameMask {

}
