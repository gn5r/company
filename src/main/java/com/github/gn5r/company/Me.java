package com.github.gn5r.company;

import java.time.LocalDate;
import java.util.List;

import com.github.gn5r.company.artifact.Infrastructure;
import com.github.gn5r.company.document.Document;
import com.github.gn5r.company.document.Excel;
import com.github.gn5r.company.document.Office;
import com.github.gn5r.company.document.PowerPoint;
import com.github.gn5r.company.document.SpecDocument;
import com.github.gn5r.company.organization.roles.technology.engineer.FullCycleEngineer;

import lombok.Getter;
import lombok.Setter;

/**
 * 俺<br>
 * 担当機能は不明なので、インスタンス生成時に決めてもらう
 */
@Getter
@Setter
public class Me<F> implements FullCycleEngineer<F> {

    private String firstName;
    private String familyName;
    private LocalDate joinDate;
    private Integer employeeNo;

    @Override
    public SpecDocument requirementsDefinition(Office requirements) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'requirementsDefinition'");
    }

    @Override
    public SpecDocument functionalDesign(Excel definition) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'functionalDesign'");
    }

    @Override
    public <T> PowerPoint plan(T data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'plan'");
    }

    @Override
    public <T> Excel research(T target) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'research'");
    }

    @Override
    public String programming(SpecDocument spec) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'programming'");
    }

    @Override
    public SpecDocument tableDesign(SpecDocument spec) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tableDesign'");
    }

    @Override
    public String uxDesign(SpecDocument spec) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'uxDesign'");
    }

    @Override
    public String uiDesign(SpecDocument spec) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'uiDesign'");
    }

    @Override
    public String mock(SpecDocument spec) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mock'");
    }

    @Override
    public Infrastructure kitting(Document spec) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'kitting'");
    }

    @Override
    public Infrastructure refactoring(Document spec) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'refactoring'");
    }

    @Override
    public Infrastructure tuning(Infrastructure infra) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tuning'");
    }

    @Override
    public String monitoring(Infrastructure infra) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'monitoring'");
    }

    @Override
    public String automate(Document manual) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'automate'");
    }

    @Override
    public Excel test(Excel spec) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'test'");
    }

    @Override
    public <I> String inquiryResponse(I inquiry) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inquiryResponse'");
    }

    @Override
    public <T, R> R troubleshooting(T issue) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'troubleshooting'");
    }

    @Override
    public <I, R> R incidentHandling(I incident) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'incidentHandling'");
    }

    @Override
    public <F> boolean release(List<F> features) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'release'");
    }

    @Override
    public String cicd(String code) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cicd'");
    }

}
