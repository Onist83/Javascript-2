let tasks = [];
let idCounter = 0;
let currentStatus = "todo";
let editingTaskId = null;

/* CLICK ADD BUTTON */
document.querySelectorAll(".add-task-btn").forEach(btn => {
    btn.addEventListener("click", () => {
        currentStatus = btn.dataset.status;
        editingTaskId = null;

        document.getElementById("taskForm").reset();
        document.getElementById("taskStatus").value = currentStatus;
    });
});

/* SAVE TASK */
document.getElementById("saveTask").addEventListener("click", () => {
    const title = taskTitle.value;
    const desc = taskDesc.value;
    const priority = taskPriority.value;
    const date = taskDate.value;

    if (!title || !desc) return;

    if (editingTaskId !== null) {
        // EDIT
        const task = tasks.find(t => t.id === editingTaskId);
        task.title = title;
        task.desc = desc;
        task.priority = priority;
        task.date = date;
    } else {
        // CREATE
        tasks.push({
            id: idCounter++,
            title,
            desc,
            priority,
            date,
            status: currentStatus
        });
    }

    render();

    bootstrap.Modal.getInstance(taskModal).hide();
});

/* RENDER */
function render() {
    document.querySelectorAll(".list").forEach(l => l.innerHTML = "");

    tasks.forEach(task => {
        const card = document.createElement("div");
        card.className = `card ${task.priority}`;
        card.innerHTML = `
            <strong>${task.title}</strong>
            <p>${task.desc}</p>
            <small>📅 ${task.date || ""}</small>
            <div class="card-actions">
                <button class="edit">✏️</button>
                <button class="delete">🗑</button>
            </div>
        `;

        card.querySelector(".delete").onclick = () => {
            tasks = tasks.filter(t => t.id !== task.id);
            render();
        };

        card.querySelector(".edit").onclick = () => {
            editingTaskId = task.id;

            taskTitle.value = task.title;
            taskDesc.value = task.desc;
            taskPriority.value = task.priority;
            taskDate.value = task.date;
            taskStatus.value = task.status;

            new bootstrap.Modal(taskModal).show();
        };

        document
            .querySelector(`[data-status="${task.status}"] .list`)
            .appendChild(card);
    });
}

render();