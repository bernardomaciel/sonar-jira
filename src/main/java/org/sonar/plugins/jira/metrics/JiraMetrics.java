/*
 * Sonar, open source software quality management tool.
 * Copyright (C) 2009 SonarSource
 * mailto:contact AT sonarsource DOT com
 *
 * Sonar is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * Sonar is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Sonar; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */

package org.sonar.plugins.jira.metrics;

import org.sonar.api.measures.Metric;
import org.sonar.api.measures.Metrics;

import java.util.Arrays;
import java.util.List;

public final class JiraMetrics implements Metrics {
  public static final String ISSUES_DOMAIN = "Issues";

  public static final String ISSUES_KEY = "issues";
  public static final Metric ISSUES = new Metric.Builder(ISSUES_KEY, "JIRA Issues", Metric.ValueType.INT)
      .setDescription("Number of JIRA Issues")
      .setDirection(Metric.DIRECTION_NONE)
      .setQualitative(false)
      .setDomain(ISSUES_DOMAIN)
      .create();
  
  public static final String BLOCKER_ISSUES_KEY = "blocker_issues";
  public static final Metric BLOCKER_ISSUES = new Metric.Builder(BLOCKER_ISSUES_KEY, "JIRA Blocker Issues", Metric.ValueType.INT)
      .setDescription("Number of JIRA Issues with priority set to Blocker")
      .setDirection(Metric.DIRECTION_NONE)
      .setQualitative(false)
      .setDomain(ISSUES_DOMAIN)
      .create();
  
  public static final String CRITICAL_ISSUES_KEY = "critical_issues";
  public static final Metric CRITICAL_ISSUES = new Metric.Builder(CRITICAL_ISSUES_KEY, "JIRA Critical Issues", Metric.ValueType.INT)
      .setDescription("Number of JIRA Issues with priority set to Critical")
      .setDirection(Metric.DIRECTION_NONE)
      .setQualitative(false)
      .setDomain(ISSUES_DOMAIN)
      .create();
  
  public static final String MAJOR_ISSUES_KEY = "major_issues";
  public static final Metric MAJOR_ISSUES = new Metric.Builder(MAJOR_ISSUES_KEY, "JIRA Major Issues", Metric.ValueType.INT)
      .setDescription("Number of JIRA Issues with priority set to Major")
      .setDirection(Metric.DIRECTION_NONE)
      .setQualitative(false)
      .setDomain(ISSUES_DOMAIN)
      .create();
  
  public static final String MINOR_ISSUES_KEY = "minor_issues";
  public static final Metric MINOR_ISSUES = new Metric.Builder(MINOR_ISSUES_KEY, "JIRA Minor Issues", Metric.ValueType.INT)
      .setDescription("Number of JIRA Issues with priority set to Minor")
      .setDirection(Metric.DIRECTION_NONE)
      .setQualitative(false)
      .setDomain(ISSUES_DOMAIN)
      .create();
  
  public static final String TRIVIAL_ISSUES_KEY = "trivial_issues";
  public static final Metric TRIVIAL_ISSUES = new Metric.Builder(TRIVIAL_ISSUES_KEY, "JIRA Trivial Issues", Metric.ValueType.INT)
      .setDescription("Number of JIRA Issues with priority set to Trivial")
      .setDirection(Metric.DIRECTION_NONE)
      .setQualitative(false)
      .setDomain(ISSUES_DOMAIN)
      .create();
  
  public List<Metric> getMetrics() {
    return Arrays.asList(ISSUES, BLOCKER_ISSUES, CRITICAL_ISSUES, MAJOR_ISSUES, MINOR_ISSUES, TRIVIAL_ISSUES );
  }

}
