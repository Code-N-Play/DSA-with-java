import os
from datetime import datetime

README = "README.md"

topics = []
total = 0

for item in sorted(os.listdir(".")):
    if os.path.isdir(item) and item not in [".git", ".github", "scripts"]:
        count = 0
        for root, dirs, files in os.walk(item):
            for file in files:
                if file.endswith(".java"):
                    count += 1

        topics.append((item, count))
        total += count

table = "| Topic | Problems |\n|------|---------:|\n"

for topic, count in topics:
    table += f"| {topic} | {count} |\n"

details = ""

for topic, count in topics:
    details += f"\n## 📂 {topic} ({count})\n"

    for root, dirs, files in os.walk(topic):
        for file in sorted(files):
            if file.endswith(".java"):
                name = os.path.splitext(file)[0]
                details += f"- ✅ {name}\n"

generated = f"""
## 📊 Repository Statistics

{table}

## 🎯 Total Solved Problems

# **{total}**

{details}

_Last Updated : {datetime.now().strftime("%d %B %Y %H:%M")}_
"""

with open(README, "r", encoding="utf-8") as f:
    content = f.read()

start = "<!-- AUTO_STATS_START -->"
end = "<!-- AUTO_STATS_END -->"

before = content.split(start)[0] + start
after = end + content.split(end)[1]

new_content = before + "\n\n" + generated + "\n\n" + after

with open(README, "w", encoding="utf-8") as f:
    f.write(new_content)

print("README Updated Successfully")
