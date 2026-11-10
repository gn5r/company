package com.github.gn5r.company;

import java.time.LocalDate;
import java.util.List;

import com.github.gn5r.company.artifacts.インフラ成果物;
import com.github.gn5r.company.artifacts.ソースコード;
import com.github.gn5r.company.artifacts.仕様書;
import com.github.gn5r.company.artifacts.成果物;
import com.github.gn5r.company.artifacts.要件定義書;
import com.github.gn5r.company.artifacts.設計書;
import com.github.gn5r.company.document.Excel;
import com.github.gn5r.company.organization.roles.technology.engineer.SE;
import com.github.gn5r.company.organization.roles.technology.engineer.保守運用エンジニア;

import lombok.Getter;
import lombok.Setter;

/**
 * 俺
 */
@Getter
@Setter
public class Me implements SE, 保守運用エンジニア {

    private String firstName;
    private String familyName;
    private LocalDate joinDate;
    private Integer employeeNo;

    @Override
    public ソースコード programming(仕様書<?> spec) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'programming'");
    }

    @Override
    public 仕様書<Excel> テスト(仕様書<Excel> spec) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'テスト'");
    }

    @Override
    public <I> String 問い合わせ対応(I inquiry) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method '問い合わせ対応'");
    }

    @Override
    public <T, R> R 保守対応(T issue) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method '保守対応'");
    }

    @Override
    public <I, R> R 障害対応(I incident) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method '障害対応'");
    }

    @Override
    public <F> boolean リリース作業(List<F> features) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'リリース作業'");
    }

    @Override
    public <I, R> R 開発者体験の向上(I input) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method '開発者体験の向上'");
    }

    @Override
    public インフラ成果物 インフラ改善(設計書<Excel> doc) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'インフラ改善'");
    }

    @Override
    public String 監視(インフラ成果物 infra) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method '監視'");
    }

    @Override
    public <R> 要件定義書<Excel> 要件定義(R requirements) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method '要件定義'");
    }

    @Override
    public 設計書<Excel> 基本設計(要件定義書<Excel> definition) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method '基本設計'");
    }

    @Override
    public 設計書<Excel> 詳細設計(設計書<Excel> definition) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method '詳細設計'");
    }

    @Override
    public 設計書<Excel> テーブル設計(仕様書<Excel> spec) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'テーブル設計'");
    }

    @Override
    public String レビュー(成果物 artifact) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'レビュー'");
    }

}
