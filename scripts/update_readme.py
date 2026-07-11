name: Update README

on:
  push:
    branches:
      - main
      - master

  workflow_dispatch:

permissions:
  contents: write

jobs:
  update-readme:

    runs-on: ubuntu-latest

    steps:

      - name: Checkout Repository
        uses: actions/checkout@v4

      - name: Setup Python
        uses: actions/setup-python@v5
        with:
          python-version: "3.11"

      - name: Install Dependencies
        run: |
          python -m pip install --upgrade pip

      - name: Update README
        run: |
          python scripts/update_readme.py

      - name: Commit Changes
        run: |
          git config user.name "github-actions[bot]"
          git config user.email "41898282+github-actions[bot]@users.noreply.github.com"

          git add README.md

          git diff --cached --quiet || git commit -m "🤖 Auto Update README"

      - name: Push Changes
        uses: ad-m/github-push-action@master
        with:
          github_token: ${{ secrets.GITHUB_TOKEN }}
          branch: ${{ github.ref_name }}