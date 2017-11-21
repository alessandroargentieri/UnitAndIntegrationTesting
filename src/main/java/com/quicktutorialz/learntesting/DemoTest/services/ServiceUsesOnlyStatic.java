package com.quicktutorialz.learntesting.DemoTest.services;

import com.quicktutorialz.learntesting.DemoTest.utilities.StaticUtils;

import static com.quicktutorialz.learntesting.DemoTest.utilities.StaticUtils.addSuffixName;

/* Aimed to demonstrate the static mock alone: useless for the rest of the project */
public interface ServiceUsesOnlyStatic{

    String callStatic(String name);

}
